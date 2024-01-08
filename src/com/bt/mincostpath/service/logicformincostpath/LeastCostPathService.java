package com.bt.mincostpath.service.logicformincostpath;

import com.bt.mincostpath.service.model.*;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class LeastCostPathService {

    Response response = new Response();
    String path ="";
    int val =0;
    int minCost =Integer.MAX_VALUE;

    public Response getLeastCostPath(Person p1, Person p2,
                                     Map<String, String> personToExchange,
                                     Map<String, List<NetworkElement>> exchangeToNetworkMap,
                                     Map<SDPair, Link> sdPairLinkMap, Map<String,
            List<DestLinkPair>> adjacencyMap, Map<String, Integer> networkToProcessingTimeMap){

        Set<String> visited = new HashSet<>();

        String srcExchange = personToExchange.get(p1.getPersonName());
        String destExchange = personToExchange.get(p2.getPersonName());

        List<NetworkElement> srcNetworkList = exchangeToNetworkMap.get(srcExchange);
        List<NetworkElement> destNetworkList = exchangeToNetworkMap.get(destExchange);

        Set<String> destinationNetworkSet = destNetworkList.stream()
                .map(item  -> item.getName()).collect(Collectors.toSet());

        String ans = "";
        int c = 0;
        for(NetworkElement ne : srcNetworkList){
            if(!visited.contains(ne.getName())){
                dfs(ne.getName() , adjacencyMap , sdPairLinkMap , visited , destinationNetworkSet, ne.getProcessingTime() , c, ans + ne.getName() , networkToProcessingTimeMap);

            }
        }

       return response;

    }

    private void dfs(String srcName, Map<String, List<DestLinkPair>> adjacencyMap,
                     Map<SDPair, Link> sdPairLinkMap,
                     Set<String> visited,
                     Set<String> destinationNetworkSet,
                     int p,
                     int c,
                     String ans, Map<String, Integer> networkToProcessingTimeMap) {

        if(destinationNetworkSet.contains(srcName)){
            visited.add(srcName);
            int cost = calculateCost(p, c);
            path = ans;
            val = cost;
            if(val < minCost){
                response.setCost(val);
                response.setPath(path);
                minCost = val;
            }
            return;
        }

        visited.add(srcName);

        if(adjacencyMap.get(srcName) !=null){
            for(DestLinkPair destLinkPair : adjacencyMap.get(srcName)){
                if(!visited.contains(destLinkPair.getDest())){
                    SDPair sdPair = new SDPair(srcName , destLinkPair.getDest());
                    Link link = sdPairLinkMap.get(sdPair);
                    c = c + link.getCost();
                    p = p + networkToProcessingTimeMap.get(destLinkPair.getDest());
                    ans += "->"+destLinkPair.getDest();
                    dfs(destLinkPair.getDest() , adjacencyMap , sdPairLinkMap , visited , destinationNetworkSet , p , c , ans , networkToProcessingTimeMap);
                }
            }
        }

        visited.remove(srcName);
    }

    private int calculateCost(int p, int c) {
        return 5*p + 2*c;
    }
}
