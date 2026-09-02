package com.world_dance.wd_lib_common.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ScheduleGenerationRequestDto {

    @NotNull(message = "El ID del evento es obligatorio")
    private Long eventId;

    @Min(value = 1, message = "La duración por slot debe ser al menos 1 minuto")
    private Integer defaultDurationMinutes = 5;

    @Min(value = 0, message = "El tiempo de transición no puede ser negativo")
    private Integer transitionMinutes = 2;

    private String sortingStrategy = "NEWEST_FIRST";

    private List<String> stageNames;

    private String notes;
}