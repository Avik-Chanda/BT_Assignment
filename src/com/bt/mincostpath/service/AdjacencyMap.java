package com.bt.mincostpath.service;

import com.bt.mincostpath.service.model.DestLinkPair;
import com.bt.mincostpath.service.model.NetworkSourceDest;

import java.util.*;

public class AdjacencyMap {

  public static Map<String, List<DestLinkPair>> getAdjacencyMatrix() {

    Map<String, List<DestLinkPair>> adjacencyMap = new HashMap<>();

    for (NetworkSourceDest ne : getNetworkDest()) {
      if (!adjacencyMap.containsKey(ne.getSrcName())) {
        adjacencyMap.put(ne.getSrcName(), new ArrayList<>());
        adjacencyMap.get(ne.getSrcName()).add(new DestLinkPair(ne.getDestName(), ne.getLink()));
      } else {
        adjacencyMap.get(ne.getSrcName()).add(new DestLinkPair(ne.getDestName(), ne.getLink()));
      }
    }
    return adjacencyMap;
  }

  public static List<NetworkSourceDest> getNetworkDest(){
      List<NetworkSourceDest> networkSourceDestList =
              Arrays.asList(
                      new NetworkSourceDest("NE1", "Link12", "NE2"),
                      new NetworkSourceDest("NE1", "Link17", "NE7"),
                      new NetworkSourceDest("NE2", "Link23", "NE3"),
                      new NetworkSourceDest("NE2", "Link25", "NE5"),
                      new NetworkSourceDest("NE2", "Link27", "NE7"),
                      new NetworkSourceDest("NE3", "Link34", "NE4"),
                      new NetworkSourceDest("NE6", "Link64", "NE4"),
                      new NetworkSourceDest("NE7", "Link78", "NE8"));
     return networkSourceDestList;
  }
}

