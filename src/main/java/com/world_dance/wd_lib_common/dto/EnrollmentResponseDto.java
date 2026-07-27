package com.world_dance.wd_lib_common.dto;

import lombok.Data;

import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class EnrollmentResponseDto {
    
    private Long id;
    private Long userId;
    private Long eventId;
    private Long categoryId;
    private String musicUrl;
    private String status;
    private String rejectionReason;
    
}