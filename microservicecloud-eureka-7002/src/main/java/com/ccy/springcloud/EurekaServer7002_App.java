package com.ccy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Description TODO
 * @Author chency
 * @Date 2020/6/5 19:10
 */
@EnableEurekaServer  //注册中心服务端
@SpringBootApplication
public class EurekaServer7002_App {

    public static void main(String[] args) {

        SpringApplication.run(EurekaServer7002_App.class,args);
    }
}
