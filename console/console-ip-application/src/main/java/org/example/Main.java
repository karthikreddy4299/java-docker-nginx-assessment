package org.example;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws UnknownHostException {

        String[] hosts = {
                            "www.google.com",
                            "www.amazon.com",
                            "www.facebook.com"
                        };
        for (String host: hosts) {
            InetAddress ip = InetAddress.getByName(host);

            String ipAddr = ip.getHostAddress();
            System.out.println("Public IP Address of " + host + " is : " + ipAddr);
        }
    }
}