package io.lazy.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;
import io.lazy.model.Ticket;

import java.util.List;

@Repository
public class TicketRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public Ticket save(Ticket ticket) {
        entityManager.persist(ticket);
        return ticket;
    }

    public Ticket findById(Long id) {
        return entityManager.find(Ticket.class, id);
    }

    public List findAll() {
        return entityManager.createQuery("from Ticket").getResultList();
    }

    public void delete(Ticket ticket) {
        entityManager.remove(ticket);
    }
    public void deleteById(Long id) {
        Ticket ticket = findById(id);
        entityManager.remove(ticket);
    }
}
