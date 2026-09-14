package com.world_dance.wd_lib_common.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.world_dance.wd_lib_common.entity.Event;
import com.world_dance.wd_lib_common.enums.Status;

public interface EventRepository extends JpaRepository<Event, Long>{

    boolean existsByName(String name);

    Event findByName(String name);

    boolean existsById(long eventId);

    /** Catálogo público paginado: eventos en un estado dado (p. ej. ACTIVE). */
    Page<Event> findByStatus(Status status, Pageable pageable);

    /** "Mis Eventos" (Todos): activos de cualquiera + todos los propios, sin importar estado. */
    Page<Event> findByStatusOrOwnerId(Status status, Long ownerId, Pageable pageable);

    /** "Mis Eventos" (Borradores/Inactivos): solo los propios que no estén en el estado dado. */
    Page<Event> findByStatusNotAndOwnerId(Status status, Long ownerId, Pageable pageable);

    /** "Mis Eventos": todos los eventos propios del organizador, sin importar estado. */
    Page<Event> findByOwnerId(Long ownerId, Pageable pageable);

}
