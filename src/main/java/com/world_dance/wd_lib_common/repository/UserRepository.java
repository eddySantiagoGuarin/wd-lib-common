package com.world_dance.wd_lib_common.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.world_dance.wd_lib_common.entity.User;



public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByEmail(String email);

    boolean existsByDocumentNumber(String documentNumber);

    Optional<User> findByEmail(String email);

    Optional<User> findByDocumentNumber(String documentNumber);

}

