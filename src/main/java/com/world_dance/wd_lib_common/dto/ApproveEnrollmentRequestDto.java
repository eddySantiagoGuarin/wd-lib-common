package com.world_dance.wd_lib_common.dto;

import com.world_dance.wd_lib_common.enums.EnrollmentStatus;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ApproveEnrollmentRequestDto {
    
    @NotNull(message = "El ID de la inscripción es obligatorio")
    private Long enrollmentId;

    @NotNull(message = "El estado de la inscripción es obligatorio")
    private EnrollmentStatus status;

    /**
     * Obligatorio solo cuando status = REJECTED (RF-28).
     * Se valida en el service, no aquí, porque solo aplica condicionalmente.
     */
    private String reason;

}
