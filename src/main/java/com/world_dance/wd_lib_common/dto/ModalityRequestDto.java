package com.world_dance.wd_lib_common.dto;

import com.world_dance.wd_lib_common.enums.Category;
import com.world_dance.wd_lib_common.enums.Division;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class ModalityRequestDto {

    /**
     * Esta es la categoria de la modalidad
     */
    @NotNull(message="La categoria es obligatoria")
    private Category category ;
    
    /**
     * Esta es la division de la modalidad
    */
    @NotNull(message="La division es obligatoria")
    private Division division ;
    
    
    /**
     * Esta es la minima edad de la modalidad
    */
    @NotNull(message="La edad minima es obligatoria")
    private Long minAge ;
    
    /**
     * Esta es la maxima edad de la modalidad
    */
    @NotNull(message="La edad maxima es obligatoria")
    private Long maxAge ;
    
    /**
     * Este es el stylo de la modalidad
    */
    @NotBlank(message="El estilo es obligatorio")
    private String style ;
    
}
