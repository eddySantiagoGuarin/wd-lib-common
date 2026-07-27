package com.world_dance.wd_lib_common.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "users")
@Data
public class User {
    /**
     * Este es el id del usuario
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
    * Este es el primer nombre del usuario
     */
    @Column(name = "first_name", nullable = false, length = 50)
    private String firstName;
    /**
     * Este es el Apellido del usuario
     */
    @Column(name = "last_name", nullable = false, length = 50)
    private String lastName;
    /**
     * Este es el numero de documento del usuario
     */
    @Column(name = "document_number", nullable = true, length = 100)
    private String documentNumber;
    /**
     * Este es el correo electrónico del usuario
     */
    @Column(nullable = false, unique = true, length = 50)
    private String email;
    /**
     * Este es el password del usuario
     */
    @Column(nullable = false)
    private String password;
    /**
     * Este es el estado del usuario
     */
    @Column(nullable = false)
    private Boolean active = true;
    /**
     * Este es el número de intentos fallidos del usuario
     */
    @Column(name = "failed_attempts", nullable = false)
    private Integer failedAttempts = 0;
    /**
     * Este es el timestamp de creación del usuario
     */
    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;
}
