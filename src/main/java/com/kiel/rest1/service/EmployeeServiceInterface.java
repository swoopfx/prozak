package com.kiel.rest1.service;

import java.util.List;

import com.kiel.rest1.entity.Employees;

public interface EmployeeServiceInterface {
    List<Employees> findAll();

    Employees saveEntity(Employees emp);

    Employees findById(int id);
}
