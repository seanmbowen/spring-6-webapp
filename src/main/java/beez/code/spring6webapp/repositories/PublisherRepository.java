package beez.code.spring6webapp.repositories;

import beez.code.spring6webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by: seanbowen on 2024-02-19
 * Architecting Solutions. Simply.
 *
 * @author seanbowen
 * @version 1.0
 * @since 2024-02-19
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long>  {
}
