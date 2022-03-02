package com.artdev.backend.services;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

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
	public CourseDto saveCourse(CourseDto dto) {		
		Course course = new Course();
		
		course.setName(dto.getName());
		course.setCategory(dto.getCategory());
		course.setProgress(dto.getProgress());
		course = repository.saveAndFlush(course);
		
		return new CourseDto(course);
	}

	@Transactional
	public void deleteCourse(@PathVariable Long id) {
		Course courseFound = repository.findById(id).get();
		if(courseFound != null) {
			repository.delete(courseFound);
		}		
	}
	
	@Transactional
	public CourseDto updateCourse(CourseDto dto, Long id) {	
		Course courseFound = repository.getById(id);
		if(courseFound != null) {
			courseFound.setName(dto.getName());
			courseFound.setCategory(dto.getCategory());
			courseFound.setProgress(dto.getProgress());
		}		
		courseFound = repository.saveAndFlush(courseFound);
		
		return new CourseDto(courseFound);
	}
}
