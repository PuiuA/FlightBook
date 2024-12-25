package repository;

import java.util.*;
import io.lazy.model.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CrudRepository<Client, Integer> {

    List<Client> findByFirstName(String firstName);

    List<Client> findByAgeLessThan(Integer age);
}
