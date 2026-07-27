package com.world_dance.wd_lib_common.enums;

/**
 * Enumeración que representa los diferentes roles de usuario.
 */
public enum Role {
    ADMIN(1L),
    ORGANIZER(2L),
    STAFF(3L),
    JURY(4L),
    PARTICIPANT(5L),
    USER(6L);

    /**
     * Este es el id del rol
     */
    private final Long id;

    Role(Long id) {
        this.id = id;
    }
    /**
     * Obtiene el id del rol
     * @return id del rol
     */
    public Long getId() {
        return id;
    }
}
