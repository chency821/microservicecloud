package com.ccy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Description TODO
 * @Author chency
 * @Date 2020/6/5 19:11
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer7003_App {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7003_App.class,args);
    }
}
