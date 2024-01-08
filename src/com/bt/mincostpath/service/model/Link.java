package com.bt.mincostpath.service.model;

import java.util.Objects;

public class Link {
    private String name;
    private int cost;

    public Link(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Link{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Link)) return false;
        Link link = (Link) o;
        return cost == link.cost && Objects.equals(name, link.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cost);
    }
}
