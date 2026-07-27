package com.world_dance.wd_lib_common.enums;


/*
 * Esta es la enumeración que representa los diferentes estados de un evento.
 */
public enum Status {
    DRAFT(1L),
    ACTIVE(2L),
    FINISHED(3L),
    CANCELLED(4L);

    private final Long id;

    /**
     * Este es el id del estado
     *
     * @param id
     */
    Status(Long id) {
        this.id = id;
    }

    /**
     * Obtiene el id del estado
     * 
     * @return id del estado
     */
    public Long getId() {
        return id;
    }
}
