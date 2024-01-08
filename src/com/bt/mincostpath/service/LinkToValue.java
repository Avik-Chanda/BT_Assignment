package com.bt.mincostpath.service;

import com.bt.mincostpath.service.model.Link;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LinkToValue {

    public static Map<String , Link> getLinkToValue(){
        List<Link> links = Arrays.asList(new Link("Link17" , 2),
                new Link("Link12" , 5),
                new Link("Link27" , 2),
                new Link("Link23" , 2),
                new Link("Link25" , 2),
                new Link("Link34" , 2),
                new Link("Link64" , 2),
                new Link("Link78" , 2),
                new Link("Link17" , 2));


        Map<String , Link> linkToValue = links.stream()
                .collect(Collectors.toMap(item -> item.getName() , item  -> item , (va1, val2) -> val2, HashMap::new));

        return linkToValue;

    }


}
