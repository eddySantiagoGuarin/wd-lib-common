package com.world_dance.wd_lib_common.dto;

import com.world_dance.wd_lib_common.enums.EventRole;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class EnrollmentRequestDto {

    @NotNull(message = "User ID es necesario")
    private Long userId;

    @NotNull(message = "Event ID es necesario")
    private Long eventId;

    @NotNull(message = "Modality ID es necesario")
    private Long modalityId;

    @NotNull(message = "Event role es necesario")
    private EventRole roleInEvent;
}
