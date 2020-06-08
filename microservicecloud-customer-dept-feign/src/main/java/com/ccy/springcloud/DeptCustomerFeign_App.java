package com.ccy.springcloud;

import com.ccy.springclod.service.DeptClientService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @Description TODO
 * @Author chency
 * @Date 2020/6/5 11:49
 */
@SpringBootApplication
@EnableEurekaClient
//@EnableFeignClients(basePackages = {"com.ccy.springcloud"})//,clients = DeptClientService.class) //开启feign
@EnableFeignClients(basePackages = {"com.ccy.springclod.service"})
public class DeptCustomerFeign_App {

    public static void main(String[] args) {
        SpringApplication.run(DeptCustomerFeign_App.class,args);
    }
}
