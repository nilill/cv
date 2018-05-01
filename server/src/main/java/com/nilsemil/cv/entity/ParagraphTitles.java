package com.nilsemil.cv.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class ParagraphTitles {

    private String completedCourses = "";
    private String ongoingCourses = "";
    private String techIHaveUsed = "";
    private String hobbies = "";
    private String howPageWasMade = "";
    private String contact = "";
    private String language = "";
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    public ParagraphTitles() {

    }

    public ParagraphTitles(String CompletedCourses, String ongoingCourses, String techIHaveUsed, String hobbies, String howPageWasMade, String contact, String language) {
        completedCourses = CompletedCourses;
        this.ongoingCourses = ongoingCourses;
        this.techIHaveUsed = techIHaveUsed;
        this.hobbies = hobbies;
        this.howPageWasMade = howPageWasMade;
        this.contact = contact;
        this.language = language;
    }
}