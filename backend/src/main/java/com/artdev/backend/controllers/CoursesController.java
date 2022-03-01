package com.artdev.backend.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class CoursesController {

    @GetMapping
    public String hello(){
        return "Hello for courses API!";
    }
}
