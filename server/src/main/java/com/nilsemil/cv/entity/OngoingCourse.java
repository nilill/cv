package com.nilsemil.cv.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class OngoingCourse {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String course;
    private String language;

    protected OngoingCourse() {
    }

    public OngoingCourse(String course, String language) {
        this.course = course;
        this.language = language;
    }

}