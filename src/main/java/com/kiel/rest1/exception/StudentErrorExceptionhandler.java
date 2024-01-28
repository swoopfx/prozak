package com.kiel.rest1.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StudentErrorExceptionhandler {

     @ExceptionHandler
    ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException exec) {
        StudentErrorResponse error = new StudentErrorResponse();
        error.setMessage(exec.getMessage());
        error.setStatus(HttpStatus.NOT_ACCEPTABLE.value());
        error.setTimestamp(System.currentTimeMillis());

        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }



    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException(Exception exc) {
        StudentErrorResponse error = new StudentErrorResponse();
        error.setMessage(exc.getMessage());
        error.setStatus(HttpStatus.BAD_GATEWAY.value());
        error.setTimestamp(System.currentTimeMillis());
        return new ResponseEntity<StudentErrorResponse>(error, HttpStatus.BAD_REQUEST);
    }
    
}
