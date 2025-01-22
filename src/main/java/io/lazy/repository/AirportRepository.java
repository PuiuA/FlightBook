package io.lazy.repository;

import io.lazy.model.Airport;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AirportRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public Airport save(Airport airport) {
        entityManager.persist(airport);
        return airport;
    }

    public Airport findById(Long id) {
        return entityManager.find(Airport.class, id);
    }

    public List findAll() {
        return entityManager.createQuery("from Airport").getResultList();
    }

    public Airport update(Airport airport) {
        return entityManager.merge(airport);
    }

    public void delete(Airport airport) {
        entityManager.remove(airport);
    }

    public void deleteById(Long id) {
        Airport airport = entityManager.find(Airport.class, id);
        entityManager.remove(airport);
    }
}
