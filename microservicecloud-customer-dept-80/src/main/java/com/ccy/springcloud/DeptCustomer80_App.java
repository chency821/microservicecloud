package com.ccy.springcloud;

import com.ccy.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @Description TODO
 * @Author chency
 * @Date 2020/6/5 11:49
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "MICROSERVICECLOUD-DEPT",configuration = MySelfRule.class )
public class DeptCustomer80_App {

    public static void main(String[] args) {
        SpringApplication.run(DeptCustomer80_App.class,args);
    }
}
