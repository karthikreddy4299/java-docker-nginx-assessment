package com.example.model;

public class Host {
    private String hostname;
    private String ipAddr;

    public Host(String host, String ipAddr) {
        this.hostname = host;
        this.ipAddr = ipAddr;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getIpAddr() {
        return ipAddr;
    }

    public void setIpAddr(String ipAddr) {
        this.ipAddr = ipAddr;
    }
}
