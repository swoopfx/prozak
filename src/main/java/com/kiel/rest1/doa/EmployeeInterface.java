package com.kiel.rest1.doa;

import java.util.List;

import com.kiel.rest1.entity.Employees;

public interface EmployeeInterface {

    public void save();

    public List<Employees> getEmployees();

    Employees findOneEmployee(int id);
}
