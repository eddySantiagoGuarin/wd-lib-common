package com.world_dance.wd_lib_common.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class UpdateOverlayRequesDto {
    
    @NotBlank(message="El id del turno activo es obligatorio")
    private String currentSlotId ;
    
    @NotBlank(message="El nombre del bailarin o grupo en tarima es obligatorio")
    private String participantLabel ;
    
    @NotNull(message="La cslificacion cal culada en tiempo real es obligatoria")
    private Double realTimeScore ;
    
    private Boolean isActive ;

}
