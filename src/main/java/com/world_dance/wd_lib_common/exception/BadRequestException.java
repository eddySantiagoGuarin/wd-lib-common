package com.world_dance.wd_lib_common.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BadRequestException extends RuntimeException {

    /**
     * Exception personalizada
     * @param message
     */
    public BadRequestException(String message) {
        super(message);
    }

    
}
