package com.nilsemil.cv.controller;

import com.nilsemil.cv.entity.Education;
import com.nilsemil.cv.service.EducationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class EducationController {

    @Resource
    private EducationService educationService;

    @CrossOrigin
    @GetMapping(value = "/education/{language}")
    private ResponseEntity<List<Education>> findByLanguage(@PathVariable String language) {
        return new ResponseEntity<>(educationService.findByLanguage(language), HttpStatus.OK);
    }

}
