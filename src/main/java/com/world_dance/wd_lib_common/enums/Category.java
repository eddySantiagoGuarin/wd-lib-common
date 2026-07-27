package com.world_dance.wd_lib_common.enums;

public enum  Category {
    
    CLASSICAL(1L),
    CONTEMPORARY(2L),
    FOLK(3L),
    URBAN(4L),
    BALLROOM(5L),
    LATIN(6L);

    private Long id ;

     /**
     * Este es el id de la categoria
     *
     * @param id
     */
    Category(Long id) {
        this.id = id;
    }

    /**
     * Obtiene el id de la categoria
     * 
     * @return id de la categorya
     */
    public Long getId() {
        return id;
    }

}
