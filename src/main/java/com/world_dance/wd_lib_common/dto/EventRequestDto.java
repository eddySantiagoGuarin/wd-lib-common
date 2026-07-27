package com.world_dance.wd_lib_common.dto;



import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.world_dance.wd_lib_common.enums.Status;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class EventRequestDto {
    
    /**
     * Este es el id del organizador del evento
    */
    private Long ownerId;
    /**
     * Este es el nombre del evento
    */
    @NotBlank(message = "El nombre del evento es obligatorio")
    private String name;

     /**
     * Este es la descripcion del evento
     */
    @NotBlank(message = "La descripcion del evento es obligatoria")
    private String description;
    
    /**
     * Este es la fecha de inicio del evento
    */
    @NotNull(message = "La fecha de inicio del evento es obligatoria")
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime startDate;
    
    /**
     * Este es la fecha de finalizacion del evento
    */
    @NotNull(message = "La fecha de finalizacion del evento es obligatoria")
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime endDate;
    
    /**
     * Este es la ubicacion del evento
    */
    @NotBlank(message = "La ubicacion del evento es obligatoria")
    private String location;
    
    /**
     * Este es el estado del evento
    */
    @NotNull(message = "El estado del evento es obligatorio")
    private Status status; 
}
 