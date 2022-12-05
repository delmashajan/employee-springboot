package com.nest.employeeapp_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class EmployeeController {

    @PostMapping("/")
    public String Welcomeemployee(){
        return "welcome employee";
    }
    @PostMapping("/add")
    public String Addemployee(){
        return "add employee";
    }
    @PostMapping("/search")
    public String Searchemployee(){
        return "search employee";
    }
    @PostMapping("/edit")
    public String Editemployee(){
        return "edit employee";
    }
    @GetMapping("/view")
    public String Viewemployee(){
        return "view employee";
    }
    @PostMapping("/delete")
    public String Deleteemployee(){
        return "delete employee";
    }


}
