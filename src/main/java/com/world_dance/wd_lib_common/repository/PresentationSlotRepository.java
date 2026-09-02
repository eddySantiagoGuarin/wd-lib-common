package com.world_dance.wd_lib_common.repository;

import com.world_dance.wd_lib_common.entity.PresentationSlot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PresentationSlotRepository extends JpaRepository<PresentationSlot, Long> {
    
    List<PresentationSlot> findByScheduleId(Long scheduleId);
    
    @Query("SELECT p FROM PresentationSlot p WHERE p.scheduleId = :scheduleId ORDER BY p.presentationOrder ASC")
    List<PresentationSlot> findByScheduleIdOrdered(@Param("scheduleId") Long scheduleId);
    
    void deleteByScheduleId(Long scheduleId);
}