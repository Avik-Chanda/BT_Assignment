package com.bt.mincostpath.service.model;

import java.util.Objects;

public class Person {

    private String personName;
    private String exchange;

    public Person(String personName, String exchange) {
        this.personName = personName;
        this.exchange = exchange;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personName='" + personName + '\'' +
                ", exchange='" + exchange + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return Objects.equals(personName, person.personName) && Objects.equals(exchange, person.exchange);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personName, exchange);
    }
}
