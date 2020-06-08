package com.ccy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Description TODO
 * @Author chency
 * @Date 2020/6/7 14:08
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableZuulProxy  //开启zuul服务
public class Zuul_9527_SpringCloudApp {

    public static void main(String[] args) {
        SpringApplication.run(Zuul_9527_SpringCloudApp.class,args);
    }

}
