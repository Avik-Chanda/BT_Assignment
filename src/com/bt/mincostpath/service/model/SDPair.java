package com.bt.mincostpath.service.model;

import java.util.Objects;

public class SDPair {

    private String src;
    private String dest;

    public SDPair(String src, String dest) {
        this.src = src;
        this.dest = dest;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    @Override
    public String toString() {
        return "SDPair{" +
                "src='" + src + '\'' +
                ", dest='" + dest + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SDPair)) return false;
        SDPair sdPair = (SDPair) o;
        return Objects.equals(src, sdPair.src) && Objects.equals(dest, sdPair.dest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(src, dest);
    }
}
