package com.ccy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Description TODO
 * @Author chency
 * @Date 2020/6/7 13:34
 */
@SpringBootApplication
@EnableHystrixDashboard
public class DeptCustomer_Dashboad_App {

    public static void main(String[] args) {
        SpringApplication.run(DeptCustomer_Dashboad_App.class,args);
    }
}
