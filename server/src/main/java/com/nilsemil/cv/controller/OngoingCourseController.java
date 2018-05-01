package com.nilsemil.cv.controller;

import com.nilsemil.cv.entity.OngoingCourse;
import com.nilsemil.cv.service.OngoingCourseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class OngoingCourseController {

    @Resource
    private OngoingCourseService ongoingCourseService;

    @CrossOrigin
    @GetMapping(value = "/ongoing/{language}")
    private ResponseEntity<List<OngoingCourse>> findByLanguage(@PathVariable String language) {
        return new ResponseEntity<>(ongoingCourseService.findByLanguage(language), HttpStatus.OK);
    }


}
