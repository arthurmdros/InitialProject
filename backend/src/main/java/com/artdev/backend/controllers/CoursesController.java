package com.artdev.backend.controllers;

import java.util.List;

import com.artdev.backend.dto.CourseDto;
import com.artdev.backend.model.Course;
import com.artdev.backend.services.CoursesService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @GetMapping(value = "/{id}")
    public @ResponseBody Course listOne(@PathVariable Long id) {
        return service.findOne(id);
    }

    @PostMapping
	public CourseDto insert(@RequestBody CourseDto dto) {		
		return service.saveCourse(dto);		        
	}
    
	@DeleteMapping(value = "/{id}")
	public void delete(@PathVariable Long id) {
		service.deleteCourse(id);
	}
    
    @PutMapping(value = "/{id}")
	public CourseDto update(@PathVariable Long id, @RequestBody CourseDto dto ) {
		return service.updateCourse(dto, id);					
	}
}