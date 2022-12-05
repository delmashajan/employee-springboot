package com.nest.employeeapp_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class EmployeeController {

    @GetMapping("/")
    public String Welcomeemployee(){
        return "welcome employee";
    }
    @GetMapping("/add")
    public String Addemployee(){
        return "add employee";
    }
    @GetMapping("/search")
    public String Searchemployee(){
        return "search employee";
    }
    @GetMapping("/edit")
    public String Editemployee(){
        return "edit employee";
    }
    @GetMapping("/view")
    public String Viewemployee(){
        return "view employee";
    }
    @GetMapping("/delete")
    public String Deleteemployee(){
        return "delete employee";
    }


}
