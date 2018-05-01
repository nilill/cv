package com.nilsemil.cv.service;

import com.nilsemil.cv.entity.OngoingCourse;
import com.nilsemil.cv.repository.OngoingCourseRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class OngoingCourseService {

    @Resource
    private OngoingCourseRepository ongoingCourseRepository;


    public List<OngoingCourse> findByLanguage(String language) {
        return (List<OngoingCourse>) ongoingCourseRepository.findAllByLanguage(language);
    }

    public List<OngoingCourse> findAll() {
        return (List<OngoingCourse>) ongoingCourseRepository.findAll();
    }
}
