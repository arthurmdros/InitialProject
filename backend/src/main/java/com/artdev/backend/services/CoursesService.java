package com.artdev.backend.services;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.artdev.backend.dto.CourseDto;
import com.artdev.backend.model.Course;
import com.artdev.backend.repository.CourseRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoursesService {
    @Autowired
	private CourseRepository repository;
	
	@Transactional(readOnly = true)
	public List<Course> findAll(){
        return repository.findAll();
	}
	
	@Transactional(readOnly = true)
	public Course findOne(Long id){
		return repository.findById(id).get();
	}

	@Transactional
	public CourseDto savePessoa(CourseDto dto) {		
		Course course = new Course();
		
		course.setName(dto.getName());
		course.setCategory(dto.getCategory())
		course.setProgress(dto.getProgress());
		course = repository.saveAndFlush(course);
		
		return new CourseDto(course);
	}
}
