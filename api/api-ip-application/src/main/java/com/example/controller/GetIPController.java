package com.example.controller;

import com.example.model.ApiResponse;
import com.example.model.Host;
import com.example.service.GetIPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.UnknownHostException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class GetIPController {

    @Autowired
    private GetIPService getIPService;

    @GetMapping("/ips")
    public ApiResponse<List<Host>> getIpsForHosts() throws UnknownHostException {
        return new ApiResponse<>(HttpStatus.OK.value(), "IPs fetched successfully.",getIPService.getIpsForHosts());
    }
}
