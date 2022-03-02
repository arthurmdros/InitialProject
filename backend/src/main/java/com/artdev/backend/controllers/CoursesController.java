package com.artdev.backend.controllers;

import java.util.List;

import com.artdev.backend.model.Course;
import com.artdev.backend.services.CoursesService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/courses")
@AllArgsConstructor
public class CoursesController {

    private final CoursesService service;

    @GetMapping
    public @ResponseBody List<Course> list() {
        return service.findAll();
    }
}