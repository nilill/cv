package com.nilsemil.cv.service;

import com.nilsemil.cv.entity.ParagraphTitles;
import com.nilsemil.cv.repository.ParagraphTitleRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

@Service
@Transactional
public class ParagraphTitleService {

    @Resource
    private ParagraphTitleRepository paragraphTitleRepository;


    public ParagraphTitles findByLanguage(String language) {
        return (ParagraphTitles) paragraphTitleRepository.findByLanguage(language);
    }

    public ParagraphTitles findAll() {
        return (ParagraphTitles) paragraphTitleRepository.findAll();
    }
}
