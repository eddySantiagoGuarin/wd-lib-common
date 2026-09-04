package com.world_dance.wd_lib_common.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.world_dance.wd_lib_common.entity.MusicTrack;

public interface MusicTrackRepository extends MongoRepository<MusicTrack, String> {
    
    Optional<MusicTrack> findByEnrollmentId(Long enrollmentId);
}
