package io.lazy.repository;

import io.lazy.model.FlightStatus;
import io.lazy.model.StatusName;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface FlightStatusRepository extends CrudRepository<FlightStatus, Long> {
    Optional<FlightStatus> findByName(StatusName name);
}
