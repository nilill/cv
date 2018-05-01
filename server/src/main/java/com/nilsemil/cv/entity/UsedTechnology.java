package com.nilsemil.cv.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class UsedTechnology {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String skill;
    private String description;
    private String language;


    protected UsedTechnology() {
    }

    public UsedTechnology(String skill, String description, String language) {
        this.skill = skill;
        this.description = description;

        this.language = language;
    }

}