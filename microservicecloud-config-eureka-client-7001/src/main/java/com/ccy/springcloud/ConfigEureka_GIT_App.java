package com.ccy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Description TODO
 * @Author chency
 * @Date 2020/6/7 18:11
 */
@SpringBootApplication
@EnableEurekaServer
public class ConfigEureka_GIT_App {

    public static void main(String[] args) {
        SpringApplication.run(ConfigEureka_GIT_App.class,args);
    }
}
