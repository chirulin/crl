package com.tuling.controller;

import com.tuling.entity.Dept;
import com.tuling.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptController {
    //依赖注入dept 业务层
    @Autowired
    private DeptService deptService;

    @GetMapping("All")
    public List<Dept> selectDeptAll(){
        return deptService.findAll();
    }

    @GetMapping("insertDept")
    public Boolean insertDept(){
        Dept d = new Dept();
        d.setDeptno(50);
        d.setDname("aaa");
        d.setLoc("bbb");
        return deptService.insertDept(d);
    }

    @Value("${spring.datasource.url}")
    public String url;

    @GetMapping("url")
    public String url(){
        return url;
    }
}
