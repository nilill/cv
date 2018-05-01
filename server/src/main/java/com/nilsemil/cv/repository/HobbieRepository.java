package com.nilsemil.cv.repository;

import com.nilsemil.cv.entity.Hobbie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface HobbieRepository extends CrudRepository<Hobbie, String> {

    List<Hobbie> findAllByLanguage(String language);
}