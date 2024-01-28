package com.kiel.rest1.rest;

import org.springframework.web.bind.annotation.RestController;

import com.kiel.rest1.entity.Employees;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping(path = "/api/employee")
public class EmployeesController {

    @GetMapping("/employees")
    public Employees getEmployees() {
        return new Employees();
    }

    @GetMapping("/test")
    public String getMethodName() {
        return "Got here";
    }
    

}
