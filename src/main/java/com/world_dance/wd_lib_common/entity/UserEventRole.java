package com.world_dance.wd_lib_common.entity;

import com.world_dance.wd_lib_common.enums.EventRole;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "user_event_roles")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class UserEventRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(name = "event_id", nullable = false)
    private Long eventId;

    @Enumerated(EnumType.STRING)
    @Column(name = "role_in_event", nullable = false)
    private EventRole roleInEvent;
}
