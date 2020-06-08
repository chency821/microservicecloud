package com.ccy.springcloud.controller;

import com.ccy.springclod.entity.Dept;
import com.ccy.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Description TODO
 * @Author chency
 * @Date 2020/6/4 18:34
 */
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;
    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "dept/add",method = RequestMethod.POST)
    public boolean  addDpet(@RequestBody Dept dept){

        return deptService.addDept(dept);
    }

    @RequestMapping(value = "dept/get/{id}",method = RequestMethod.GET)
    public Dept  findById(@PathVariable("id") Long id){
        return deptService.findById(id);
    }

    @RequestMapping(value = "dept/list",method = RequestMethod.GET)
    public List<Dept> findAll(Dept dept){
        return deptService.findAll();
    }

    @RequestMapping(value = "dept/discovery",method = RequestMethod.GET)
    public Object discovery(){
        List<String> list = discoveryClient.getServices();
        System.out.println("*****"+list);
        List<ServiceInstance> instances = discoveryClient.getInstances("MICROSERVICECLOUD-DEPT");
        for (ServiceInstance instance: instances) {
            System.out.println(instance.getServiceId()+"\t"+instance.getHost()+"\t"+instance.getPort()
            +"\t"+instance.getUri());
        }
        return this.discoveryClient;
    }
}
