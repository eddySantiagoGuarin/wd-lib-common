package com.world_dance.wd_lib_common.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * Datos editables de la configuración de ingesta/retransmisión de una sesión de transmisión ya
 * creada (servidor RTMP, clave de retransmisión, canal, título/descripción). No incluye el
 * estado de la sesión (statusStream): ese ciclo de vida lo gobiernan los endpoints dedicados
 * (toggleState/finish), no una edición libre.
 */
@Data
@RequiredArgsConstructor
public class UpdateStreamConfigRequestDto {

    @NotBlank(message = "La URL del canal es obligatoria")
    private String channelUrl;

    @NotBlank(message = "La URL del servidor RTMP/ingesta es obligatoria")
    private String rtmpUrl;

    @NotBlank(message = "La clave de retransmisión es obligatoria")
    private String streamKey;

    private String title;

    private String description;
}
