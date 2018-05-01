package com.nilsemil.cv.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@Entity
public class CompletedCourse implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String course;
    private int grade;
    private String language;
    private String description;
    protected CompletedCourse() {
    }

    public CompletedCourse(String course, int grade, String language, String description) {
        this.course = course;
        this.grade = grade;
        this.language = language;
        this.description = description;
    }
}