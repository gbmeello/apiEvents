package com.gabrielmello.apiEvents.repositories;

import com.gabrielmello.apiEvents.domain.event.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EventRepository extends JpaRepository<Event, UUID> {
}
