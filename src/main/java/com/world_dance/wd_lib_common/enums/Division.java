package com.world_dance.wd_lib_common.enums;

public enum Division {
    
    GROUP(1L),
    DUET(2L),
    SOLO(3L);

    private Long id ;

     /**
     * Este es el id de la division
     *
     * @param id
     */
    Division(Long id) {
        this.id = id;
    }

    /**
     * Obtiene el id de la divicion
     * 
     * @return id de la divicion
     */
    public Long getId() {
        return id;
    }

}
