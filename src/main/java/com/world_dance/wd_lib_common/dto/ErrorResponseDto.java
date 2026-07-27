package com.world_dance.wd_lib_common.dto;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ErrorResponseDto {
    /**
     * Este es el código de estado HTTP de la respuesta
     */
    private Integer status;
    /**
     * Este es el mensaje de error
     */
    private String message;
    /**
     * Este es el timestamp del error
     */
    private LocalDateTime timestamp;
}
