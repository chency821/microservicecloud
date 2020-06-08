package com.ccy.springclod.service;

import com.ccy.springclod.entity.Dept;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Description TODO
 * @Author chency
 * @Date 2020/6/6 23:07
 */
@Component
@Slf4j
public class DeptClientServiceFallback  implements DeptClientService{
    @Override
    public boolean addDept(Dept dept) {
        return false;
    }

    @Override
    public Dept findById(Long id) {
        log.info("cuowu ");
        return new Dept().setDeptno(id).setDname("该ID："+id+"没有对应的信息,客户端提供降级服务，此服务暂停")
                .setDb_source("no this database in Mysql");
    }

    @Override
    public List<Dept> findAll() {
        return null;
    }
}
