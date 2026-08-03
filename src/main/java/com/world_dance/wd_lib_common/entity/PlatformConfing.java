package com.world_dance.wd_lib_common.entity;


import org.springframework.data.mongodb.core.mapping.Field;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class PlatformConfing {
    
    
    @Field("provider")
    private String provider ;
    
    @Field("channel_url")
    private String channelUrl ;
    
    @Field("player_iframe")
    private String playerIframeUrl ;
    
    @Field("chat_iframe")
    private String chatIframeUrl ;
}
