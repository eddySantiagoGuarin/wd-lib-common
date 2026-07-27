package com.world_dance.wd_lib_common.dto;

import com.world_dance.wd_lib_common.enums.Category;
import com.world_dance.wd_lib_common.enums.Division;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class ModalityResponseDto {
    
    /**
     * Este es el id de la modalidad
     */
    private Long id ;

    /**
     * Este es el id del evento 
     */
    private Long eventId ;

    /**
     * Esta es la categoria de la modalidad
     */
    private Category category ;

    /**
     * Esta es la division de la modalidad
     */
    private Division division ;
    
    
    /**
     * Esta es la minima edad de la modalidad
     */
    private Long minAge ;
    
    /**
     * Esta es la maxima edad de la modalidad
     */
    private Long maxAge ;
    
    /**
     * Este es el stylo de la modalidad
     */
    private String style ;

}
