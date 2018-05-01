package com.nilsemil.cv.repository;

import com.nilsemil.cv.entity.Education;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EducationRepository extends CrudRepository<Education, String> {
    List<Education> findAllByLanguage(String language);

}
