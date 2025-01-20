package io.lazy.repository;

import io.lazy.model.FlightStatus;
import org.springframework.data.repository.CrudRepository;

public interface FlightStatusRepository extends CrudRepository<FlightStatus, Long> {

}
