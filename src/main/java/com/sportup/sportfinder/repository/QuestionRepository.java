package com.sportup.sportfinder.repository;

import com.sportup.sportfinder.domain.Question;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.*;


/**
 * Spring Data JPA repository for the Question entity.
 */
@SuppressWarnings("unused")
@Repository
public interface QuestionRepository extends JpaRepository<Question,Long> {
    
}
