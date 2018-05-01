package com.nilsemil.cv.controller;

import com.nilsemil.cv.entity.CompletedCourse;
import com.nilsemil.cv.service.CompletedCourseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class CompletedCourseController {

    @Resource
    private CompletedCourseService completedCourseService;

    @CrossOrigin
    @GetMapping(value = "/completed/{language}")
    private ResponseEntity<List<CompletedCourse>> findByLanguage(@PathVariable String language) {
        return new ResponseEntity<>(completedCourseService.findByLanguage(language), HttpStatus.OK);
    }


}
