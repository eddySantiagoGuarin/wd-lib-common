package com.world_dance.wd_lib_common.repository;

import com.world_dance.wd_lib_common.entity.Schedule;
import com.world_dance.wd_lib_common.enums.ScheduleStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
    
    Optional<Schedule> findByEventId(Long eventId);
    
    Optional<Schedule> findByEventIdAndStatus(Long eventId, ScheduleStatus status);
    
    void deleteByEventId(Long eventId);
    
    boolean existsByEventId(Long eventId);
}