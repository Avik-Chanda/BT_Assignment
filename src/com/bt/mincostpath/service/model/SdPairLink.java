package com.bt.mincostpath.service.model;

import com.bt.mincostpath.service.AdjacencyMap;
import com.bt.mincostpath.service.LinkToValue;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SdPairLink {

    public static Map<SDPair, Link> getSdPairLinkMap(){


        Map<SDPair,Link> sdPairLinkMap =
                AdjacencyMap.getNetworkDest().stream()
                        .collect(Collectors.toMap(item -> new SDPair(item.getSrcName() ,
                                        item.getDestName()),item -> LinkToValue.getLinkToValue().get(item.getLink()) ,
                                (v1  , v2) -> v2 , HashMap::new));

        return sdPairLinkMap;
    }
}
