package com.artdev.backend.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import lombok.Data;

@Data
@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    @JsonProperty("_id")
    private Long id;

    @Column(length = 200, nullable = false)
    private String name;

    @Column(length = 10, nullable = false)
    private String category;

    @Column(length = 20, nullable = false)
    private String progress;
    
}
