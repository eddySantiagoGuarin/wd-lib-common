package com.world_dance.wd_lib_common.exception;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
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
     * Este es el timestamp de la respuesta
     */
    private LocalDateTime timestamp;
}

