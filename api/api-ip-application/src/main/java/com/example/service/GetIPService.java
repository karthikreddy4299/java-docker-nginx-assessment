package com.example.service;

import com.example.model.Host;

import java.net.UnknownHostException;
import java.util.List;

public interface GetIPService {

    List<Host> getIpsForHosts() throws UnknownHostException;
}
