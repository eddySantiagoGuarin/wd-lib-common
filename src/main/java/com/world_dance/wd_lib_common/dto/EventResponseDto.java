package com.world_dance.wd_lib_common.dto;


import com.world_dance.wd_lib_common.enums.Status;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class EventResponseDto {

    
    /**
     * Este es el id del evento
     */
    private Long IdEvent;

    /**
     * Este es el id del organizador
     */
    private Long ownerId;
    
     /**
     * Este es el nombre del evento
     */
    private String name;

     /**
     * Este es la descripcion del evento
     */
    private String description;

     /**
     * Este es la fecha de inicio del evento
     */
    private String startDate;

     /**
     * Este es la fecha de finalizacion del evento
     */
    private String endDate;

     /**
     * Este es la ubicacion del evento
     */
    private String location;
    
     /**
     * Este es el estado del evento
     */
    private Status status;

    /**
     * Este es el mensaje de respuesta del evento
     */
    private String message;
}
