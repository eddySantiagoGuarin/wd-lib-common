package com.world_dance.wd_lib_common.entity;



import org.springframework.data.mongodb.core.mapping.Document;

import com.world_dance.wd_lib_common.enums.StatusStream;

import jakarta.persistence.Id;
import lombok.Data;

@Data
@Document(collection = "stream_sessions")
public class StreamSession {
    
    @Id
    private String id;

    private Long eventId;
    
    private StatusStream statusStream ;
    
    private PlatformConfing platformConfing ;

    private LiveOverlayData liveOverlayData ;

    private VodInfo vodInfo ;

    private Timestamps timestamps ;

}
