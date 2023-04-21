package com.example.service;

import com.example.model.Host;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

@Service(value = "getIPService")
public class GetIPServiceImpl implements GetIPService {

    @Value("#{'${hosts}'.split(',')}")
    private List<String> hostnames;
    @Override
    public List<Host> getIpsForHosts() throws UnknownHostException {
        List<Host> hosts = new ArrayList<>();
        for (String host: hostnames) {
            InetAddress ip = InetAddress.getByName(host);
            String ipAddr = ip.getHostAddress();
            hosts.add(new Host(host, ipAddr));
        }
        return hosts;
    }
}
