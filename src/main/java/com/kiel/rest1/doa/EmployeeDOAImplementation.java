package com.kiel.rest1.doa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kiel.rest1.entity.Employees;

import jakarta.persistence.EntityManager;

@Repository
public class EmployeeDOAImplementation implements EmployeeInterface {

    private EntityManager entityManager;

    @Autowired
    public EmployeeDOAImplementation(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void save() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public List<Employees> getEmployees() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getEmployees'");
    }

    @Override
    public Employees findOneEmployee(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findOneEmployee'");
    }

}
