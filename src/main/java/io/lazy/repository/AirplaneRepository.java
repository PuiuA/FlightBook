package io.lazy.repository;


import io.lazy.model.Airplane;
import org.springframework.data.repository.CrudRepository;

public interface AirplaneRepository extends CrudRepository<Airplane,Long> {
}
