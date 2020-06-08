package com.ccy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Description TODO
 * @Author chency
 * @Date 2020/6/4 18:41
 */
//@MapperScan("com.ccy.springcloud.dao") //替换@mapper
@SpringBootApplication
@EnableEurekaClient  // 服务自动注册到注册中心
@EnableDiscoveryClient //服务发现
@EnableCircuitBreaker //开启熔断器
public class DeptProviderHystrix8001_App {

    public static void main(String[] args) {
        SpringApplication.run(DeptProviderHystrix8001_App.class,args);
    }
}
