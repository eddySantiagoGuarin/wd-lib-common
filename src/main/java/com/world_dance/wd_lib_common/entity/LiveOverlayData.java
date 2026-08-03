package com.world_dance.wd_lib_common.entity;


import org.springframework.data.mongodb.core.mapping.Field;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class LiveOverlayData {

   
    @Field("current_Slot_Id")
    private String currentSlotId ;
    
    @Field("participant_label")
    private String participantLabel ;
    
    @Field("real_time_score")
    private Double realTimeScore ;
    
    @Field("is_active")
    private Boolean isActive ;
    

}
