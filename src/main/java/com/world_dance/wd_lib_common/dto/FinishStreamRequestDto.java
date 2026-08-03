package com.world_dance.wd_lib_common.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class FinishStreamRequestDto {
    
    private Boolean isAvailable ;

    private String recordingUrl ;

}
