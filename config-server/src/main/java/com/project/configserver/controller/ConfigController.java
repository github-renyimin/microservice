package com.project.configserver.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope // 支持配置文件动态刷新
@RestController
public class ConfigController {

    @Value("${address}")
    private String address;

    @RequestMapping(value = "/getConfigInfo", method = RequestMethod.GET)
    public String getConfigInfo(){
        System.out.println("address" + address );
        return address;
    }


}
