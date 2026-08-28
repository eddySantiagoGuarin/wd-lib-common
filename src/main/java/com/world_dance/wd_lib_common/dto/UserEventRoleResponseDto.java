package com.world_dance.wd_lib_common.dto;

import com.world_dance.wd_lib_common.enums.EventRole;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserEventRoleResponseDto {
    private Long id;
    private Long userId;
    private Long eventId;
    private EventRole roleInEvent;
}