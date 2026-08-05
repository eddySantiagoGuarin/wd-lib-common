package com.world_dance.wd_lib_common.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.world_dance.wd_lib_common.entity.StreamSession;
import com.world_dance.wd_lib_common.enums.StatusStream;


public interface StreamSessionRepository extends MongoRepository<StreamSession,String>{
    
    Optional<StreamSession> findByEventId(Long eventId);

    List<StreamSession> findByStatusStream(StatusStream statusStream);

    boolean existsByEventId(Long eventId);
}
