package com.world_dance.wd_lib_common.entity;

import com.world_dance.wd_lib_common.enums.ScheduleStatus;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "schedules")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "event_id", nullable = false)
    private Long eventId;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ScheduleStatus status;

    @Column(name = "created_at", insertable = false, updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at", insertable = false, updatable = false)
    private LocalDateTime updatedAt;

    @OneToMany(mappedBy = "scheduleId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<PresentationSlot> presentationSlots;
}