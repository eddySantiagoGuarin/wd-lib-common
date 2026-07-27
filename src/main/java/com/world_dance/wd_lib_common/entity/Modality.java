package com.world_dance.wd_lib_common.entity;

import com.world_dance.wd_lib_common.enums.Category;
import com.world_dance.wd_lib_common.enums.Division;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "modality")
@Data
public class Modality {
    
    /**
     * Este es el id de la modalidad
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;

    /**
     * Este es el id del evento 
     */
    @Column(name = "event_id" , nullable=false)
    private Long eventId ;

    /**
     * Esta es la categoria de la modalidad
     */
    @Enumerated(EnumType.STRING)
    @Column(name = "category" , nullable=false)
    private Category category ;

    /**
     * Esta es la division de la modalidad
     */
    @Enumerated(EnumType.STRING)
    @Column(name = "division" , nullable=false)
    private Division division ;
    
    
    /**
     * Esta es la minima edad de la modalidad
     */
    @Column(name = "min_age" , nullable=false)
    private Long minAge ;
    
    /**
     * Esta es la maxima edad de la modalidad
     */
    @Column(name = "max_age" , nullable=false)
    private Long maxAge ;
    
    /**
     * Este es el stylo de la modalidad
     */
    @Column(name = "style" , nullable=false, length=100)
    private String style ;
  
}
