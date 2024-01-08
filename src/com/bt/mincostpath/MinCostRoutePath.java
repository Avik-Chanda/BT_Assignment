package com.bt.mincostpath;

import com.bt.mincostpath.service.*;
import com.bt.mincostpath.service.logicformincostpath.LeastCostPathService;
import com.bt.mincostpath.service.model.*;

import java.util.List;
import java.util.Map;

public class MinCostRoutePath {

  public static void main(String[] args) {

    Map<String, String> personToExchange = PersonToExchange.getPersonToExchange();

    Map<String , List<DestLinkPair>>  adjacencyMap = AdjacencyMap.getAdjacencyMatrix();

    Map<SDPair, Link> sdPairLinkMap =SdPairLink.getSdPairLinkMap();

    Map<String, Integer> networkToProcessingTimeMap = ExchangeToNetWork.getNetworkToProcessingTime();

    Map<String , List<NetworkElement>> exchangeToNetworkMap = ExchangeToNetWork.getExchangeToNetWorkMap();

    LeastCostPathService leastCostPathService = new LeastCostPathService();

    Person p1 = new Person("PersonA" , "Exchange1");
    Person p2 = new Person("PersonB" , "Exchange4");

    Response result = leastCostPathService.getLeastCostPath(p1 , p2 , personToExchange , exchangeToNetworkMap , sdPairLinkMap , adjacencyMap, networkToProcessingTimeMap);

    System.out.println("Result is "+result);

  }
}
