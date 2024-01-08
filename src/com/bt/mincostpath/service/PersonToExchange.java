package com.bt.mincostpath.service;

import com.bt.mincostpath.service.model.Person;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PersonToExchange {

    public static Map<String, String> getPersonToExchange(){
        List<Person> persons = Arrays.asList(new Person("PersonA" , "Exchange1"),
                new Person("PersonB" , "Exchange4"),
                new Person("PersonC" , "Exchange3"));

        Map<String, String> personToExchange = persons.stream()
                .collect(Collectors.toMap(item  -> item.getPersonName() , item -> item.getExchange()));

        return personToExchange;
    }
}
