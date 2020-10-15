package com.tuling.service.impl;

import com.tuling.dao.DeptMapper;
import com.tuling.entity.Dept;
import com.tuling.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DeptService_Impl implements DeptService {
    //注入部门mapper
    @Resource
    private DeptMapper deptMapper;

    @Override
    public List<Dept> findAll() {
        return deptMapper.selectByExample(null);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,readOnly = false)
    public Boolean insertDept(Dept dept) {
        int i = deptMapper.insertSelective(dept);
        return i>0?true:false;
    }
}
