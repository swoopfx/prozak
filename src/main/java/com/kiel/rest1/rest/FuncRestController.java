package com.kiel.rest1.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kiel.rest1.entity.Student;
import com.kiel.rest1.exception.StudentErrorResponse;

@RestController

@RequestMapping(path = "/fun")
public class FuncRestController {

    @GetMapping(path = "/well")
    public String newAction() {
        return "Just Got here";
    }

}
