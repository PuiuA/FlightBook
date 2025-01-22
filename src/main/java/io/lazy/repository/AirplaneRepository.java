package io.lazy.repository;

import io.lazy.model.Airplane;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AirplaneRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public Airplane findById(Long id) {
        return entityManager.find(Airplane.class, id);
    }

    public List findAll() {
        return entityManager.createQuery("from Airplane").getResultList();
    }

    public Airplane save(Airplane airplane) {
        entityManager.persist(airplane);
        return airplane;
    }

    public void delete(Airplane airplane) {
        entityManager.remove(airplane);
    }

    public void deleteById(Long id) {
        Airplane airplane = entityManager.find(Airplane.class, id);
        entityManager.remove(airplane);
    }
    public Airplane update(Airplane airplane) {
        return entityManager.merge(airplane);
    }
}
