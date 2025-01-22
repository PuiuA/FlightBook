package io.lazy.repository;

import io.lazy.model.Service;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ServiceRepository  {
    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public Service save(Service service) {
        entityManager.persist(service);
        return service;
    }

    public Service findById(long id) {
        return entityManager.find(Service.class, id);
    }

    public List findAll() {
        return entityManager.createQuery("from Service").getResultList();
    }
    public Service update(Service service) {
        return entityManager.merge(service);
    }
    public void delete(Service service) {
        entityManager.remove(service);
    }
    public void deleteById(Long id) {
        Service service = findById(id);
        entityManager.remove(service);
    }
}
