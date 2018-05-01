package com.nilsemil.cv.repository;

import com.nilsemil.cv.entity.UsedTechnology;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsedTechnologyRepository extends CrudRepository<UsedTechnology, Long> {
    List<UsedTechnology> findAllByLanguage(String language);
}
