package com.nilsemil.cv.service;

import com.nilsemil.cv.entity.Hobbie;
import com.nilsemil.cv.repository.HobbieRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.List;


@Service
@Transactional
public class HobbieService {


    @Resource
    private HobbieRepository hobbieRepository;


    public List<Hobbie> findByLanguage(String language) {
        return (List<Hobbie>) hobbieRepository.findAllByLanguage(language);
    }

    public List<Hobbie> findAll() {
        return (List<Hobbie>) hobbieRepository.findAll();
    }
}
