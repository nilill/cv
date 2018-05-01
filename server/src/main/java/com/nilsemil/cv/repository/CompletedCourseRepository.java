package com.nilsemil.cv.repository;

import com.nilsemil.cv.entity.CompletedCourse;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompletedCourseRepository extends CrudRepository<CompletedCourse, String> {
    List<CompletedCourse> findAllByLanguage(String language);

}
