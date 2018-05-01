package com.nilsemil.cv.service;

import com.nilsemil.cv.repository.UsedTechnologyRepository;
import com.nilsemil.cv.entity.UsedTechnology;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class UsedTechologyService {
    @Resource
    private UsedTechnologyRepository usedTechnologyRepository;


    public List<UsedTechnology> findByLanguage(String language) {
        return (List<UsedTechnology>) usedTechnologyRepository.findAllByLanguage(language);
    }

    public List<UsedTechnology> findAll() {
        return (List<UsedTechnology>) usedTechnologyRepository.findAll();
    }
}
