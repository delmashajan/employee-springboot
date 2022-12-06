package com.nest.employeeapp_backend.controller;

import com.nest.employeeapp_backend.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class EmployeeController {

    @PostMapping("/")
    public String Welcomeemployee(){
        return "welcome employee";
    }
    @PostMapping(value = "/add",consumes = "application/json",produces = "application/json")
    public String Addemployee(@RequestBody Employee e){
        System.out.println(e.getName().toString());
        System.out.println(e.getEmpcode());
        System.out.println(e.getCompanyname().toString());
        System.out.println(e.getDesignation().toString());
        System.out.println(e.getSalary());
        System.out.println(e.getMobileno().toString());
        System.out.println(e.getUsername().toString());
        System.out.println(e.getPassword().toString());

        return "add employee";
    }



}
