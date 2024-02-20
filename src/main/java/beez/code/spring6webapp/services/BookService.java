package beez.code.spring6webapp.services;

import beez.code.spring6webapp.domain.Book;

/**
 * Created by: seanbowen on 2024-02-20
 * Architecting Solutions. Simply.
 *
 * @author seanbowen
 * @version 1.0
 * @since 2024-02-20
 */
public interface BookService {
    public Iterable<Book> findAll();
}
