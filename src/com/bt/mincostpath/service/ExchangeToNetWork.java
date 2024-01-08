package com.bt.mincostpath.service;

import com.bt.mincostpath.service.model.NetworkElement;

import java.util.*;
import java.util.stream.Collectors;

public class ExchangeToNetWork {

    public static Map<String , List<NetworkElement>> getExchangeToNetWorkMap(){


        Map<String , List<NetworkElement>> exchangeToNetworkMap = new HashMap<>();

        for(NetworkElement ne : getNetWorkElement()){
            if (!exchangeToNetworkMap.containsKey(ne.getExchange())) {
                exchangeToNetworkMap.put(ne.getExchange(), new ArrayList<>());
                exchangeToNetworkMap.get(ne.getExchange()).add(ne);
            }
            else{
                exchangeToNetworkMap.get(ne.getExchange()).add(ne);
            }
        }

        return exchangeToNetworkMap;
    }

    public static Map<String, Integer> getNetworkToProcessingTime(){
         Map<String, Integer> networkToProcessingTimeMap = getNetWorkElement().stream().collect(Collectors.toMap(item -> item.getName() , item -> item.getProcessingTime()));
         return networkToProcessingTimeMap;
    }

    private static List<NetworkElement> getNetWorkElement(){
        List<NetworkElement> networkElementList = Arrays.asList(new NetworkElement("NE1" , 5 , "Exchange1"),
                new NetworkElement("NE2" , 2 , null),
                new NetworkElement("NE3" , 4 , "Exchange4"),
                new NetworkElement("NE4" , 2 , null),
                new NetworkElement("NE5" , 4 , "Exchange3"),
                new NetworkElement("NE6" , 8 , "Exchange2"),
                new NetworkElement("NE7" , 9 , "Exchange1"),
                new NetworkElement("NE8" , 2 , "Exchange4"));

        return networkElementList;

    }
}
