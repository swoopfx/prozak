package com.kiel.rest1.rest;

import org.springframework.web.bind.annotation.RestController;

import com.kiel.rest1.doa.EmployeeDOAImplementation;
import com.kiel.rest1.entity.Employees;
import com.kiel.rest1.service.EmployeeServiceInterface;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping(path = "/api/employee")
public class EmployeesController {

    private EmployeeServiceInterface imp;

    @Autowired
    public void setImp(EmployeeServiceInterface imm) {
        this.imp = imm;
    }

    @GetMapping("/employees")
    public List<Employees> getEmployees() {
        // return new Employees();
        return imp.findAll();
    }

    @GetMapping("/test")
    public Employees getMethodName() {
        // EmployeeDOAImplementation imp = new EmployeeDOAImplementation();
        // imp.save();
        // return "Got here";
        Employees emp = new Employees();
        UUID uid = UUID.randomUUID();
        emp.setFirstName("Segussn");
        emp.setLastName("Ajayi");
        emp.setUuid(uid.toString());
        emp.setEmail(uid.toString() + "@gmail.com");
        return imp.saveEntity(emp);
    }

    @GetMapping("/employee/{emp}")
    public Employees getSingleEmployee(@PathVariable int emp) {
        return imp.findById(emp);
    }

    @PostMapping("/employe")
    public Employees addNewEmployees(@RequestBody Employees entity) {
        // TODO: process POST request

        // entity.setId(0);
        Employees newEmployee = imp.saveEntity(entity);
        return newEmployee;
    }

    @PutMapping("/employe/{id}")
    public String putMethodName(@PathVariable String id, @RequestBody String entity) {
        //TODO: process PUT request
        
        return entity;
    }

}
