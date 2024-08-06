package com.kiel.rest1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kiel.rest1.doa.EmployeeDOAImplementation;
import com.kiel.rest1.entity.Employees;

import jakarta.persistence.EntityManager;

@Service
public class EmployeeService implements EmployeeServiceInterface {

    private EmployeeDOAImplementation employeeDao;

    private EntityManager entityManager;

    public EmployeeService() {

    }

    @Autowired
    public void setEmployeeDao(EmployeeDOAImplementation dao) {
        this.employeeDao = dao;
    }

    // @Autowired
    // public void setEntityManager(EntityManager entity){
    // entityManager = entity;
    // }

    @Override
    public List<Employees> findAll() {

        return employeeDao.getEmployees();
    }

    @Override
    @Transactional
    public Employees saveEntity(Employees Emp) {
        return employeeDao.save(Emp);
    }

    @Override
    public Employees findById(int id) {
        return employeeDao.findById(id);
    }

}
