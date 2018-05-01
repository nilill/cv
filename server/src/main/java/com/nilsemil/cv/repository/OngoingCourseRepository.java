package com.nilsemil.cv.repository;

import com.nilsemil.cv.entity.OngoingCourse;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OngoingCourseRepository extends CrudRepository<OngoingCourse, String> {
    List<OngoingCourse> findAllByLanguage(String language);
}
