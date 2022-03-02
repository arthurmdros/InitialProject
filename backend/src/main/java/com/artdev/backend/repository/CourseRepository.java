package com.artdev.backend.repository;

import com.artdev.backend.model.Course;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course,Long>{
    
}
