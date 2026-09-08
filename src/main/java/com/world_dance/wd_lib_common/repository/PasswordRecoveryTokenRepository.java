package com.world_dance.wd_lib_common.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.world_dance.wd_lib_common.entity.PasswordRecoveryToken;
import com.world_dance.wd_lib_common.entity.User;

@Repository
public interface PasswordRecoveryTokenRepository extends JpaRepository<PasswordRecoveryToken, Long> {
    Optional<PasswordRecoveryToken> findByCodeAndUserAndUsedFalse(String code, User user);
    Optional<PasswordRecoveryToken> findTopByUserAndUsedFalseOrderByExpiryDateDesc(User user);
}
