package com.kiel.rest1.exception;


public class StudentNotFoundException extends RuntimeException {

    public StudentNotFoundException() {
        super();
    }

    public StudentNotFoundException(String message){
        super(message);
    }

    // public StudentNotFoundException()
}
