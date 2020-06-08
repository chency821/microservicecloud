package com.ccy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @Description TODO
 * @Author chency
 * @Date 2020/6/7 16:02
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ConfigClient_3355_SpringCloudApp {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClient_3355_SpringCloudApp.class,args);
    }

}
