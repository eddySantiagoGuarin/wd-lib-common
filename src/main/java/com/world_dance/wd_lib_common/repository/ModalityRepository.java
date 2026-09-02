package com.world_dance.wd_lib_common.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.world_dance.wd_lib_common.entity.Modality;
import com.world_dance.wd_lib_common.enums.Category;
import com.world_dance.wd_lib_common.enums.Division;


public interface ModalityRepository extends JpaRepository<Modality, Long>{

    boolean existsByCategoryAndDivisionAndMinAgeAndMaxAge(Category category, Division division, Long minAge, Long maxAge);

    boolean existsByEventIdAndCategoryAndDivisionAndMinAgeAndMaxAge(Long eventId, Category category, Division division, Long minAge, Long maxAge);

    List<Modality> findByEventId(Long eventId);

    List<Modality> findByCategory(Category category);
}