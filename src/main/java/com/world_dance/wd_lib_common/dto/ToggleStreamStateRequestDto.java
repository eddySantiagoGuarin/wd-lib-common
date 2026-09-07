package com.world_dance.wd_lib_common.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ToggleStreamStateRequestDto {
    private Boolean enable;
    private String sourceType;
    private String destinationUrl;

    public ToggleStreamStateRequestDto(Boolean enable) {
        this.enable = enable;
    }
}

