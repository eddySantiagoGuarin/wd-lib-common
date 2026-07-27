package com.world_dance.wd_lib_common.exception;

public class BadRequestException extends RuntimeException {

    /**
     * Exception personalizada
     * @param message
     */
    public BadRequestException(String message) {
        super(message);
    }

    
}
