package com.world_dance.wd_lib_common.dto;


import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class UserRequestDto {
    
    /**
    * Este es el primer nombre del usuario
    */
    @NotBlank(message = "El nombre es obligatorio")
    private String firstName;
    /**
    * Este es el apellido del usuario
    */
    @NotBlank(message = "El apellido es obligatorio")
    private String lastName;
    /**
     * Este es el numero de documento del usuario
     */
    @NotBlank(message = "El numero de documento es obligatorio")
    private String documentNumber;
    /**
     * Este es el correo electrónico del usuario
     */
    @NotBlank(message = "El correo electrónico es obligatorio")
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
