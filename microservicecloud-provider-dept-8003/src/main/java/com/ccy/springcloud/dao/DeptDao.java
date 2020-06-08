package com.ccy.springcloud.dao;

import com.ccy.springclod.entity.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Description TODO
 * @Author chency
 * @Date 2020/6/4 18:13
 */
//@Repository 或者@Componet
@Mapper
public interface DeptDao {

    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();


}
