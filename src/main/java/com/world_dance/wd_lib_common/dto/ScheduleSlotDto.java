package com.world_dance.wd_lib_common.dto;

import com.world_dance.wd_lib_common.enums.Category;
import com.world_dance.wd_lib_common.enums.Division;
import com.world_dance.wd_lib_common.enums.ScheduleStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ScheduleSlotDto {

    private Long id;
    private Long enrollmentId;
    private String participantName;
    private String groupName;
    private Division division;
    private Category category;
    private String style;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String stage;
    private Integer order;
    private ScheduleStatus status;
    private String notes;
}