package com.ccy.springcloud.controller;

import com.ccy.springclod.entity.Dept;
import com.ccy.springclod.service.DeptClientService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description TODO
 * @Author chency
 * @Date 2020/6/5 11:40
 */
@RestController
@Slf4j
public class DeptController_Customer {

    @Autowired
    private DeptClientService deptClientService;

    @RequestMapping(value = "customer/dept/add")
    public boolean  addDept(Dept dept){
        return deptClientService.addDept(dept);
    }

    @RequestMapping(value = "customer/dept/get/{id}")
    public Dept  findById(@PathVariable("id") Long id){
        log.info("fdfdfd");
        return deptClientService.findById(id);
    }

    @RequestMapping(value = "customer/dept/list")
    public List<Dept> findAll(){
        return deptClientService.findAll();
    }


}
