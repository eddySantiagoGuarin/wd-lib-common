package com.world_dance.wd_lib_common.enums;

public enum  StatusStream {
    DRAFT(1L),
    SCHEDULED(2L),
    LIVE(3L),
    FINISHED(4L);

    private final Long id ;

    /**
     * Este es el id del estado
     *
     * @param id
     */
    StatusStream(Long id) {
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
