package com.nest.employeeapp_backend.controller;

import com.nest.employeeapp_backend.dao.EmployeeDao;
import com.nest.employeeapp_backend.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController

public class EmployeeController {

    @Autowired
    private EmployeeDao dao;

    @PostMapping("/")
    public String Welcomeemployee(){
        return "welcome employee";
    }

    @CrossOrigin(origins = "*")
    @PostMapping(value = "/add",consumes = "application/json",produces = "application/json")
    public Map<String,String> Addemployee(@RequestBody Employee e){
        System.out.println(e.getName().toString());
        System.out.println(e.getEmpcode());
        System.out.println(e.getCompanyname().toString());
        System.out.println(e.getDesignation().toString());
        System.out.println(e.getSalary());
        System.out.println(e.getMobileno().toString());
        System.out.println(e.getUsername().toString());
        System.out.println(e.getPassword().toString());

        dao.save(e);

        HashMap<String,String> map = new HashMap<>();

        return map;
    }
    @CrossOrigin(origins ="*")
    @GetMapping("/view")
    public List<Employee> Viewall(){
        return (List<Employee>) dao.findAll();
    }



}
