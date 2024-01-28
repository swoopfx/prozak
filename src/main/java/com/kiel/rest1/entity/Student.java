package com.kiel.rest1.entity;

import lombok.Data;

public @Data class Student {

    private Integer id;

    private String firstName;

    private String lastName;

    public Student() {

    }

    public Student(Integer id, String firstname, String lastname) {
        this.id = id;
        this.firstName = firstname;
        this.lastName = lastname;
    }

}
