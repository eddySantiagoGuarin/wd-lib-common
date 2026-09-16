package com.world_dance.wd_lib_common.dto;

import java.time.Instant;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * DTO que representa la respuesta estructurada de metadatos de una pista musical.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MusicTrackResponseDto {

    /**
     * Identificador único del documento en MongoDB
     */
    private String id;
    
    /**
     * Identificador de la inscripción asociada a la pista
     */
    private Long enrollmentId;
    
    /**
     * Nombre original del archivo subido
     */
    private String filename;
    
    /**
     * Formato o extensión del archivo multimedia
     */
    private String format;
    
    /**
     * Tamaño del archivo expresado en Kilobytes (KB)
     */
    private Double sizeKb;
    
    /**
     * Duración estimada del audio en segundos
     */
    private Double durationSeconds;
    
    /**
     * Estado activo o inactivo de la pista musical
     */
    private Boolean isActive;
    
    /**
     * Fecha y hora en que fue subida o actualizada la pista
     */
    private Instant uploadedAt;

    /**
     * Historial de versiones reemplazadas de la pista (más antigua primero).
     * No incluye el identificador interno de almacenamiento (gridFsId), solo
     * lo relevante para mostrarlo a quien gestiona la inscripción.
     */
    private List<HistoryEntryDto> history;

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class HistoryEntryDto {
        private String previousFilename;
        private Instant replacedAt;
    }
}
