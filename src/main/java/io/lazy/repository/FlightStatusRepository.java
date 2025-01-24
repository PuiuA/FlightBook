package io.lazy.repository;

import io.lazy.model.FlightStatus;
import io.lazy.model.StatusName;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public class FlightStatusRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public FlightStatus findById(Long id) {
        return entityManager.find(FlightStatus.class, id);
    }

    public List<FlightStatus> findAll() {
        return entityManager.createQuery("from FlightStatus", FlightStatus.class).getResultList();
    }

    public FlightStatus save(FlightStatus flightStatus) {
        entityManager.persist(flightStatus);
        return flightStatus;
    }

    public FlightStatus update(FlightStatus flightStatus) {
        return entityManager.merge(flightStatus);
    }
    public void deleteById(Long id) {
        FlightStatus flightStatus = entityManager.find(FlightStatus.class, id);
    }
    public void delete(FlightStatus flightStatus) {
        entityManager.remove(flightStatus);
    }

}
