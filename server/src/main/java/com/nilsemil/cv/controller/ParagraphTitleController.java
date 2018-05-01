package com.nilsemil.cv.controller;

import com.nilsemil.cv.entity.ParagraphTitles;
import com.nilsemil.cv.service.ParagraphTitleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ParagraphTitleController {

    @Resource
    private ParagraphTitleService paragraphTitleService;

    @CrossOrigin
    @GetMapping(value = "/titles/{language}")
    private ResponseEntity<ParagraphTitles> findByLanguage(@PathVariable String language) {
        return new ResponseEntity<>(paragraphTitleService.findByLanguage(language), HttpStatus.OK);
    }


}
