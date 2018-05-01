package com.nilsemil.cv.service;

import com.nilsemil.cv.entity.Education;
import com.nilsemil.cv.repository.EducationRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class EducationService {


    @Resource
    private EducationRepository educationRepository;


    public List<Education> findByLanguage(String language) {
        return (List<Education>) educationRepository.findAllByLanguage(language);
    }

    public List<Education> findAll() {
        return (List<Education>) educationRepository.findAll();
    }
}
