package com.kiel.rest1.doa;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.kiel.rest1.entity.Employees;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Repository
public class EmployeeDOAImplementation implements EmployeeInterface {

    private EntityManager entityManager;

    public EmployeeDOAImplementation(){

    }

    @Autowired
    public EmployeeDOAImplementation(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save() {
        // TODO Auto-generated method stub
        Employees emp = new Employees();
        UUID uid = UUID.randomUUID();
        emp.setFirstName("Segun");
        emp.setLastName("Ajayi");
        emp.setUuid(uid.toString());
        emp.setEmail("agn@gmail.com");
        // throw new UnsupportedOperationException("Unimplemented method 'save'");

        entityManager.persist(emp);
        // entityManager.flush();
    }

    @Override
    public List<Employees> getEmployees() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method
        // 'getEmployees'");
        TypedQuery<Employees> theQuery = entityManager.createQuery("FROM Employees", Employees.class);
        return theQuery.getResultList();
    }

    @Override
    public List<Employees> findOneEmployee(int id) {
        // TODO Auto-generated method stub
        TypedQuery<Employees> theQuery = entityManager.createQuery("FROM Employees where id=:id", Employees.class);
         theQuery.setParameter("id", id);
         return theQuery.getResultList();
        // throw new UnsupportedOperationException("Unimplemented method 'findOneEmployee'");
    }

    @Override
    public Employees findById(int id) {
        return entityManager.find(Employees.class, id);
    }

   

    @Override
    public Employees save(Employees emp) {
        Employees newEmployee = entityManager.merge(emp);
        return newEmployee;
    }

    

}
