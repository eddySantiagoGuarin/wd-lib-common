package com.world_dance.wd_lib_common.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ToggleStreamStateRequestDto {
    private Boolean enable;
}
