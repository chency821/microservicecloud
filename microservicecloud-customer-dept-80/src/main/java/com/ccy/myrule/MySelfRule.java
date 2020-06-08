package com.ccy.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description TODO
 * @Author chency
 * @Date 2020/6/5 23:34
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule(){
//        return new RandomRule();//替换默认的轮询策略
        return new RandomRule_CY(); //自定义轮询调用五次
    }

}
