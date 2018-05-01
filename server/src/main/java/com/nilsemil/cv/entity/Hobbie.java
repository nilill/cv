package com.nilsemil.cv.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Data
@Entity
public class Hobbie {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String hobbie;
    private String language;

    protected Hobbie() {}

    public Hobbie(String hobbie, String language) {
        this.hobbie = hobbie;
        this.language = language;
    }
    @Override
    public String toString() {
        return String.format("%d ) %s", id, hobbie);

    }
}