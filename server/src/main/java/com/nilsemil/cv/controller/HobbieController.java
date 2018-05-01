package com.nilsemil.cv.controller;

import com.nilsemil.cv.entity.Hobbie;
import com.nilsemil.cv.service.HobbieService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class HobbieController {

    @Resource
    private HobbieService hobbieService;

    @CrossOrigin
    @GetMapping(value = "/hobbies/{language}")
    private ResponseEntity<List<Hobbie>> findByLanguage(@PathVariable String language) {
        return new ResponseEntity<>(hobbieService.findByLanguage(language), HttpStatus.OK);
    }


}
