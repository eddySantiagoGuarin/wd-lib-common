package com.world_dance.wd_lib_common.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.world_dance.wd_lib_common.entity.StreamSession;


public interface StreamSessionRepository extends MongoRepository<StreamSession,String>{
    
    Optional<StreamSession> findByEventId(String id);

    List<StreamSession>findByStatus(String status);

    boolean existsByEventId(String eventId);
}
