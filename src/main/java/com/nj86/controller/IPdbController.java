package com.nj86.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import com.nj86.utils.IPAddressUtils;
import com.nj86.utils.IPLocation;

@RestController
public class IPdbController  {
    private final IPAddressUtils ip_utils = new IPAddressUtils();
    @RequestMapping("/get_ip")
    public String getIp(@RequestParam String ip) {
        IPLocation iplocation = ip_utils.getIPLocation(ip);
        return iplocation.toString();
    }
}