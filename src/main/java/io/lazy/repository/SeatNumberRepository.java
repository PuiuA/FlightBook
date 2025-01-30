package io.lazy.repository;

import io.lazy.model.SeatNumber;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SeatNumberRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public SeatNumber save(SeatNumber seatNumber) {
        entityManager.persist(seatNumber);
        return seatNumber;
    }

    public SeatNumber findById(Long id) {
        return entityManager.find(SeatNumber.class, id);
    }

    public List<SeatNumber> findAll() {
        return entityManager.createQuery("from SeatNumber", SeatNumber.class).getResultList();
    }

    public void delete(SeatNumber seatNumber) {
        entityManager.remove(seatNumber);
    }

    public void deleteById(Long id) {
        SeatNumber seatNumber = entityManager.find(SeatNumber.class, id);
    }

    public SeatNumber update(SeatNumber seatNumber) {
        return entityManager.merge(seatNumber);
    }

}
