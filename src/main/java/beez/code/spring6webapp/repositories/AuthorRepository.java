package beez.code.spring6webapp.repositories;

import beez.code.spring6webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by: seanbowen on 2024-02-19
 * Architecting Solutions. Simply.
 *
 * @author seanbowen
 * @version 1.0
 * @since 2024-02-19
 */
@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
