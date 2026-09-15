package com.world_dance.wd_lib_common.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ParticipantSummaryDto {

    private Long id;

    private String name;

    private String lastName;

    private String email;

    private String documentNumber;
}
