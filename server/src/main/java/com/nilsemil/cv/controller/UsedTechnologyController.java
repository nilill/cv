package com.nilsemil.cv.controller;

import com.nilsemil.cv.entity.UsedTechnology;
import com.nilsemil.cv.service.UsedTechologyService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UsedTechnologyController {

    @Resource
    private UsedTechologyService usedTechologyService;

    @CrossOrigin
    @GetMapping(value = "/usedTech/{language}")
    private ResponseEntity<List<UsedTechnology>> findByLanguage(@PathVariable String language) {
        return new ResponseEntity<>(usedTechologyService.findByLanguage(language), HttpStatus.OK);
    }


}
