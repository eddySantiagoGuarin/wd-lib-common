package com.world_dance.wd_lib_common.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ScheduleGenerationResponseDto {

    private Long eventId;
    private String eventName;
    private LocalDateTime eventStartDate;
    private LocalDateTime eventEndDate;
    private Integer totalSlots;
    private LocalDateTime generatedAt;
    private List<ScheduleSlotDto> schedules;
}