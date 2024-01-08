package com.bt.mincostpath.service.model;

public class Response {

    private int cost;
    private String path;


    public Response(){}

    public Response(int cost, String path) {
        this.cost = cost;
        this.path = path;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "Response{" +
                "cost=" + cost +
                ", path='" + path + '\'' +
                '}';
    }
}
