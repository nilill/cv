package com.nilsemil.cv.repository;

import com.nilsemil.cv.entity.ParagraphTitles;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParagraphTitleRepository extends CrudRepository<ParagraphTitles, String> {
    ParagraphTitles findByLanguage(String language);
}
