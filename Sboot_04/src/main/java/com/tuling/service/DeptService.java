package com.tuling.service;

import com.tuling.entity.Dept;

import java.util.List;

public interface DeptService {
    /**
     * 查询所有部门
     * @return
     */
    public List<Dept> findAll();

    /**
     * 添加部门
     * @param dept  部门对象
     * @return
     */
    public Boolean insertDept(Dept dept);
}
