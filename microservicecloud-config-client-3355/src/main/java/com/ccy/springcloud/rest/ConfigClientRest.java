package com.ccy.springcloud.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Author chency
 * @Date 2020/6/7 16:00
 */
@RestController
public class ConfigClientRest {

    @Value("${spring.application.name}")
    private String applicatonName;

    @Value("${eureka.client.service-url.defaultZone}")
    private String eurekaServer;

    @Value("${server.port}")
    private String port;

    @RequestMapping("/config")
    public String  getConfig(){
        String str = "applicatonName:"+applicatonName+"\t"+"eurekaServer:"+eurekaServer+"\t"+"port:"+port;
        System.out.println("str===="+str);
        return str;
    }



}
