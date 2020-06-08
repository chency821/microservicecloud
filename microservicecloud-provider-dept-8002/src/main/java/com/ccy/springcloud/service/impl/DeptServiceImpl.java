package com.ccy.springcloud.service.impl;

import com.ccy.springclod.entity.Dept;
import com.ccy.springcloud.dao.DeptDao;
import com.ccy.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description TODO
 * @Author chency
 * @Date 2020/6/4 18:28
 */
@Service
public class DeptServiceImpl  implements DeptService {

    @Autowired
    private DeptDao deptDao;

    @Override
    public boolean addDept(Dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public Dept findById(Long id) {
        return deptDao.findById(id);
    }

    @Override
    public List<Dept> findAll() {
        return deptDao.findAll();
    }
}
