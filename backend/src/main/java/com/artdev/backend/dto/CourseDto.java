package com.artdev.backend.dto;

import com.artdev.backend.model.Course;

import lombok.Data;

@Data
public class CourseDto {
    
    private Long id;
    private String name;
    private String category;
    private String progress;

    public CourseDto() {}

	public CourseDto(Long id, String name, String category, String progress) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.progress = progress;
	}

	
	public CourseDto(Course course) {
		id = course.getId();
		name = course.getName();
		category = course.getCategory();
		progress = course.getProgress();
	}
}