package com.world_dance.wd_lib_common.dto;

import java.time.LocalDateTime;

import com.world_dance.wd_lib_common.enums.EnrollmentStatus;
import com.world_dance.wd_lib_common.enums.EventRole;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EnrollmentResponseDto {

    private Long enrollmentId;

    private Long userId;

    private Long eventId;

    private Long modalityId;

    private EventRole roleInEvent;

    private EnrollmentStatus status;
    
    private LocalDateTime createdAt;
    
}