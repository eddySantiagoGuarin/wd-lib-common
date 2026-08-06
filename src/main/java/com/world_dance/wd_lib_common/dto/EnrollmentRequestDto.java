package com.world_dance.wd_lib_common.dto;

import com.world_dance.wd_lib_common.enums.EventRole;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;



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

    public Long getUserId() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getUserId'");
    }

    public Long getEventId() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getEventId'");
    }

    public EventRole getRoleInEvent() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getRoleInEvent'");
    }

    public Long getModalityId() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getModalityId'");
    }
}