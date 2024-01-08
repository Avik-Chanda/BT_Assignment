package com.bt.mincostpath.service.model;

public class DestLinkPair {

    private String dest;
    private String link;

    public DestLinkPair(String dest, String link) {
        this.dest = dest;
        this.link = link;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return "DestLinkPair{" +
                "dest='" + dest + '\'' +
                ", link='" + link + '\'' +
                '}';
    }
}
