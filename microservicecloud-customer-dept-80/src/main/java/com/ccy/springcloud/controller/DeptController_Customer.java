package com.ccy.springcloud.controller;

import com.ccy.springclod.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Description TODO
 * @Author chency
 * @Date 2020/6/5 11:40
 */
@RestController
public class DeptController_Customer {

//    private static final String REST_URL_PREFIX="http://localhost:8001";
    private static final String REST_URL_PREFIX="http://MICROSERVICECLOUD-DEPT";
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "customer/dept/add")
    public boolean  addDept(Dept dept){
        return restTemplate.postForObject(REST_URL_PREFIX+"/dept/add",dept,Boolean.class);
    }

    @RequestMapping(value = "customer/dept/get/{id}")
    public Dept  findById(@PathVariable("id") Long id){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/get/"+id,Dept.class);
    }

    @RequestMapping(value = "customer/dept/list")
    public List<Dept> findAll(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/list",List.class);
    }

    @RequestMapping(value = "customer/dept/discovery")
    public Object discovery(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/discovery",Object.class);
    }

}
