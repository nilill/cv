package com.nilsemil.cv.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@Entity
public class Education  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String school;
    private int startingYear;
    private String endingYear;
    private String language;

    protected Education() {
    }

    public Education(String school, int startingYear, String endingYear, String language) {
        this.school = school;
        this.startingYear = startingYear;
        this.endingYear = endingYear;
        this.language = language;
    }

}
