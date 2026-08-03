package com.world_dance.wd_lib_common.entity;

import java.time.Instant;

import org.springframework.data.mongodb.core.mapping.Field;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Timestamps {
 
    @Field("created_at")
    private Instant createdAt ;

    @Field("scheduled_for")
    private Instant scheduledFor ;

    @Field("started_At")
    private Instant startedAt ;
    
    @Field("end_At")
    private Instant endAt ;

}
