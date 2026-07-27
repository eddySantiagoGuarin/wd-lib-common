package com.world_dance.wd_lib_common.dto;

import lombok.Data;

@Data
public class ExceptionDto {
    /** 
     * El mensaje de error que se devolverá en la respuesta 
    */
    private String message;
}
