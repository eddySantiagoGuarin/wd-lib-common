package com.world_dance.wd_lib_common.dto;


import java.time.Instant;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class CreateStreamSessionRequestDto {

    private Long eventId ;
    
    @NotBlank(message="La id del provedor es obligatoria")
    private String provider ;
    
    @NotBlank(message="La URL del canal es obligatoria")
    private String channelUrl ;
    
    @NotBlank(message="La URL del rtmp es obligatoria")
    private String rtmpUrl;
    
    @NotBlank(message="La clave de la transmision es obligatoria")
    private String streamKey;
    
    /** Ya no se captura en el formulario de creación del frontend; queda nulo salvo que un caller externo lo envíe explícitamente. */
    private Instant scheduleFor ;
    
}
