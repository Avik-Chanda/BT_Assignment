package com.bt.mincostpath.service.model;

public class NetworkSourceDest {

    private String srcName;
    private String link;
    private String destName;

    public NetworkSourceDest(String srcName, String link, String destName) {
        this.srcName = srcName;
        this.link = link;
        this.destName = destName;
    }

    public String getSrcName() {
        return srcName;
    }

    public void setSrcName(String srcName) {
        this.srcName = srcName;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getDestName() {
        return destName;
    }

    public void setDestName(String destName) {
        this.destName = destName;
    }

    @Override
    public String toString() {
        return "NetworkElement{" +
                "srcName='" + srcName + '\'' +
                ", link='" + link + '\'' +
                ", destName='" + destName + '\'' +
                '}';
    }
}
