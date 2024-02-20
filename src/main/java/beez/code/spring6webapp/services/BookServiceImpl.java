package beez.code.spring6webapp.services;

import beez.code.spring6webapp.domain.Book;
import beez.code.spring6webapp.repositories.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Created by: seanbowen on 2024-02-20
 * Architecting Solutions. Simply.
 *
 * @author seanbowen
 * @version 1.0
 * @since 2024-02-20
 */
@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;
    @Override
    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }
}
