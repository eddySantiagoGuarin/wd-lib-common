package com.world_dance.wd_lib_common.entity;

import java.time.LocalDateTime;

import com.world_dance.wd_lib_common.enums.Status;

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
@Table(name = "events")
@Data
public class Event {

    /**
     * Este es el id del evento
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Este es el id del propietario del evento
     */
    @Column(name = "owner_id", nullable = false)
    private Long ownerId;

    /**
     * Este es el nombre del evento
     */
    @Column(name = "name", nullable = false, length = 150)
    private String name;

    /**
     * Esta es la descripción del evento
     */
    @Column(name = "description", nullable = true, length = 250)
    private String description;

    /**
     * Esta es la fecha de inicio del evento
     */
    @Column(name = "start_date", nullable = false)
    private LocalDateTime startDate;

    /**
     * Esta es la fecha de finalización del evento
     */
    @Column(name = "end_date", nullable = false)
    private LocalDateTime endDate;

    /**
     * Esta es la ubicación del evento
     */
    @Column(name = "location", nullable = true, length = 150)
    private String location;

    /**
     * Este es el estado del evento
     */
    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private Status status ;

}
