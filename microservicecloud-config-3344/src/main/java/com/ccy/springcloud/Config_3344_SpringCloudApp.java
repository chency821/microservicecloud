package com.ccy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Description TODO
 * @Author chency
 * @Date 2020/6/7 15:21
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableConfigServer  //config服务端
public class Config_3344_SpringCloudApp {

    public static void main(String[] args) {
        SpringApplication.run(Config_3344_SpringCloudApp.class,args);
    }

}
