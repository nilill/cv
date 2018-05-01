package com.nilsemil.cv.service;

import com.nilsemil.cv.entity.CompletedCourse;
import com.nilsemil.cv.repository.CompletedCourseRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CompletedCourseService {

    @Resource
    private CompletedCourseRepository completedCourseRepository;


    public  List<CompletedCourse>  findByLanguage(String language) {
        return (List<CompletedCourse>) completedCourseRepository.findAllByLanguage(language);
    }

    public List<CompletedCourse> findAll() {
        return (List<CompletedCourse>) completedCourseRepository.findAll();
    }
}
