package com.world_dance.wd_lib_common.entity;

import com.world_dance.wd_lib_common.enums.SlotStatus;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalTime;

@Entity
@Table(name = "presentation_slots")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PresentationSlot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "schedule_id", nullable = false)
    private Long scheduleId;

    @Column(name = "enrollment_id", nullable = false)
    private Long enrollmentId;

    @Column(name = "presentation_order", nullable = false)
    private Integer presentationOrder;

    @Column(name = "estimated_time")
    private LocalTime estimatedTime;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private SlotStatus status;
}