package at.tlr.llmgateway.repository;

import at.tlr.llmgateway.entity.Logging;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoggingRepository extends CrudRepository<Logging, Integer> {
}
