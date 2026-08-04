package com.world_dance.wd_lib_common.enums;

public enum EventRole {
    ADMIN(1L),
    JURY(4L),
    STAFF(3L),
    PARTICIPANT(5L),
    INSTRUCTOR(7L);

    private final Long id;

    EventRole(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}