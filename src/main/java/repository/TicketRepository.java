package repository;

import io.lazy.model.TicketInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends CrudRepository<TicketInfo, Integer> {
}
