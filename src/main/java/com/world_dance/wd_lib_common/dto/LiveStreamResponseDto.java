package com.world_dance.wd_lib_common.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * Resumen público de una transmisión en vivo (statusStream = LIVE), usado por el listado
 * "/stream/live" que alimenta el indicador y el menú de la navbar sin requerir autenticación.
 */
@Data
@RequiredArgsConstructor
public class LiveStreamResponseDto {

    private Long eventId;

    private String eventName;
}
