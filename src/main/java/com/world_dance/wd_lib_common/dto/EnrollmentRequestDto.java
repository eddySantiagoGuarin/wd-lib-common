package com.world_dance.wd_lib_common.dto;

import com.world_dance.wd_lib_common.enums.EventRole;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EnrollmentRequestDto {

    @NotNull(message = "El ID del usuario es obligatorio.")
    private Long userId;

    @NotNull(message = "El ID del evento es obligatorio.")
    private Long eventId;

    @NotNull(message = "El ID de la modalidad es obligatorio.")
    private Long modalityId;

    @NotNull(message = "El rol en el evento es obligatorio.")
    private EventRole roleInEvent;

    
}