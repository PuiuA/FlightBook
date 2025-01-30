package io.lazy.repository;

import io.lazy.model.Flight;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FlightRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public Flight save(Flight flight) {
        entityManager.persist(flight);
        return flight;
    }

    public Flight findById(Long id) {
        return entityManager.find(Flight.class, id);
    }

    public List findAll() {
        return entityManager.createQuery("from Flight").getResultList();
    }

    public Flight update(Flight flight) {
        return entityManager.merge(flight);
    }

    public void delete(Flight flight) {
        entityManager.remove(flight);
    }
    public void deleteById(Long id) {
        Flight flight = entityManager.find(Flight.class, id);
    }
}
