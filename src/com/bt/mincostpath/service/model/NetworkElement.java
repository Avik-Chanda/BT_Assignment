package com.bt.mincostpath.service.model;

public class NetworkElement {
    private String name;
    private int processingTime;
    private String exchange;

    public NetworkElement(String name, int processingTime, String exchange) {
        this.name = name;
        this.processingTime = processingTime;
        this.exchange = exchange;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProcessingTime() {
        return processingTime;
    }

    public void setProcessingTime(int processingTime) {
        this.processingTime = processingTime;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    @Override
    public String toString() {
        return "NetworkElement{" +
                "name='" + name + '\'' +
                ", processingTime=" + processingTime +
                ", exchange=" + exchange +
                '}';
    }
}
