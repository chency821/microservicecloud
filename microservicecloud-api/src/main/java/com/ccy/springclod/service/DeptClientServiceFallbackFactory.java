package com.ccy.springclod.service;

import com.ccy.springclod.entity.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Description TODO
 * @Author chency
 * @Date 2020/6/6 13:54
 */
//@Component //不能忘记，不能忘记
//public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {
//    @Override
//    public DeptClientService create(Throwable throwable) {
//        return new DeptClientService(){
//
//            @Override
//            public boolean addDept(Dept dept) {
//                return false;
//            }
//
//            @Override
//            public Dept findById(Long id) {
//
//                return new Dept().setDeptno(id).setDname("该ID："+id+"没有对应的信息,客户端提供降级服务，此服务暂停")
//                        .setDb_source("no this database in Mysql");
//            }
//
//            @Override
//            public List<Dept> findAll() {
//                return null;
//            }
//        };
//    }
//}
