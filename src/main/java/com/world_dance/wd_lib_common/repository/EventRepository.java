package com.world_dance.wd_lib_common.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.world_dance.wd_lib_common.entity.Event;

public interface EventRepository extends JpaRepository<Event, Long>{
    
    boolean existsByName(String name);

    Event findByName(String name);

    boolean existsById(long eventId);
    
}
