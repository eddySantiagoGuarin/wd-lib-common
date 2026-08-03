package com.world_dance.wd_lib_common.dto;


import java.time.Instant;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class CreateStreamSessionRequesDto {
    
    @NotBlank(message="La id del provedor es obligatoria")
    private String provider ;
    
    @NotBlank(message="La URL del canal es obligatoria")
    private String channelUrl ;
    
    @NotBlank(message="El proveedor es obligatorio")
    private String playerIframeUrl="KICK" ;
    
    @NotNull(message="La fecha y hora programada para la transmision es obligatoria")
    private Instant scheduleFor ;
    
}
