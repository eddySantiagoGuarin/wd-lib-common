package com.world_dance.wd_lib_common.entity;


import org.springframework.data.mongodb.core.mapping.Field;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class VodInfo {
    
    @Field("is_available")
    private Boolean isAvailable ;

    @Field("recording_url")
    private String recordingUrl ;
    
}
