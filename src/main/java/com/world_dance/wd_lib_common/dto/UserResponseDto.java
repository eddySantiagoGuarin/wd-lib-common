package com.world_dance.wd_lib_common.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class UserResponseDto {

    /**
    * Este  es el id del usuario
    */
    private Long id;
    /**
    * Este es el primer nombre del usuario
    */
    private String firstName;
    /**
    * Este es el apellido del usuario
    */
    private String lastName;
    /**
     * Este es el numero de documento del usuario
     */
    private String documentNumber;
    /**
     * Este es el correo electrónico del usuario
     */
    private String email;
    /**
     * Este es el estado del usuario
     */
    private Boolean active;
    /**
     * Este es el mensaje de respuesta
     */
    private String message;

}