package com.world_dance.wd_lib_common.entity;

import java.time.Instant;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class KickOAuthToken {
    private String accessToken;
    private String refreshToken;
    private Long expiresIn;
    private Instant obtainedAt;
    private String tokenType;
    private String scope;
}
