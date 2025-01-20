package io.lazy.repository;


import io.lazy.model.AirPlane;
import org.springframework.data.repository.CrudRepository;

public interface AirplaneRepository extends CrudRepository<AirPlane,Long> {
}
