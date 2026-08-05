package com.world_dance.wd_lib_common.dto;

import com.world_dance.wd_lib_common.entity.LiveOverlayData;
import com.world_dance.wd_lib_common.entity.Timestamps;
import com.world_dance.wd_lib_common.entity.VodInfo;
import com.world_dance.wd_lib_common.enums.StatusStream;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class StreamAdminResponseDto {
    
    private String id ;

    @NotBlank(message="La id del evento es obligatoria")
    private Long eventId ;
    
    @Valid
    @NotNull(message="El estado de la trasmision es obligatorio")
    private StatusStream statusStream ;
    
    @NotBlank(message="El provedor de la trasmicion es obligatorio")
    private String provider="KICK" ;
    
    @NotBlank(message="La direccion para meter el <iframe> del video es obligatoria")
    private String playerIframeUrl ;
    
    @NotBlank(message="La direccion para meter el <iframe> del chat es obligatoria")
    private String chatIframeUrl ;
    
    @Valid
    @NotNull(message="La informacion del turno es obligatoria")
    private LiveOverlayData liveOverlayData ;
    
    @Valid
    @NotNull(message="La informacion de la grabacion es obligatoria")
    private VodInfo vodInfo ;

    @NotBlank(message="La url del canal es oblihatoria")
    private String channelUrl ;

    private Timestamps timestamps ;

}
