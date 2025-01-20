package io.lazy.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import io.lazy.model.Ticket;

@Repository
public interface TicketRepository extends CrudRepository<Ticket, Long> {
}
