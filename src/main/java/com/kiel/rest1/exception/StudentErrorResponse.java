package com.kiel.rest1.exception;

import lombok.Data;

public @Data class StudentErrorResponse {

    // private int id;

    private int status;

    private String message;

    private long timestamp;

    public StudentErrorResponse(){

    }

    

}
