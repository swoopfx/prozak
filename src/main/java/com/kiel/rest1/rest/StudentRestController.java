package com.kiel.rest1.rest;

import org.springframework.web.bind.annotation.RestController;

import com.kiel.rest1.entity.Student;
import com.kiel.rest1.exception.StudentErrorResponse;
import com.kiel.rest1.exception.StudentNotFoundException;

import jakarta.annotation.PostConstruct;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
// import org.springframework.web.bind.annotation.RequestMethod;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
// @RequestMapping(path = "student", method=RequestMethod.GET)
// public SomeData requestMethodName(@RequestParam String param) {
// return new SomeData();
// }
@RequestMapping(path = "/api")
public class StudentRestController {

    private List<Student> liisst = new ArrayList<>();

    private Student stud;

    @PostConstruct
    public void loadData() {
        // List<Student> liisst = new ArrayList<>();
        stud = new Student(2, "Bland".toUpperCase(), "Hauwa");
        liisst.add(new Student(5, "Imran".toUpperCase(), "KHAN"));
        liisst.add(new Student(6, "BoBA", "fit"));
        liisst.add(new Student(7, "Inter", "Faith"));
        liisst.add(stud);
        liisst.add(new Student(9, "BIND", "INFO"));
    }

    @GetMapping("/students")
    public List<Student> getStudents() {

        return liisst;
    }

    @GetMapping("/student/{studentId}")
    public Student getStudent(@PathVariable int studentId) {
        if (studentId >= liisst.size() || (studentId < 0)) {
            throw new StudentNotFoundException("Student id not found");
        }
        return liisst.get(studentId);
    }

   


}
