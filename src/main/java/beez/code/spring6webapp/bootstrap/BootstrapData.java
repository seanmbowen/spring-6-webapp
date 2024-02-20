package beez.code.spring6webapp.bootstrap;

import beez.code.spring6webapp.domain.Author;
import beez.code.spring6webapp.domain.Book;
import beez.code.spring6webapp.domain.Publisher;
import beez.code.spring6webapp.repositories.AuthorRepository;
import beez.code.spring6webapp.repositories.BookRepository;
import beez.code.spring6webapp.repositories.PublisherRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by: seanbowen on 2024-02-19
 * Architecting Solutions. Simply.
 *
 * @author seanbowen
 * @version 1.0
 * @since 2024-02-19
 */
@Component
@RequiredArgsConstructor
@Slf4j
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    @Override
    public void run(String... args) {
        createSampleData();
    }

    private void createSampleData() {
        Author eric = new Author();
        eric.setFirstName("Eric");
        eric.setLastName("Evans");

        Book ddd = new Book();
        ddd.setTitle("Domain Driven Design");
        ddd.setIsbn("123456");

        Author ericSaved = authorRepository.save(eric);
        Book dddSaved = bookRepository.save(ddd);

        Author rod = new Author();
        rod.setFirstName("Rod");
        rod.setLastName("Johnson");

        Book noEJB = new Book();
        noEJB.setTitle("J2EE Development without EJB");
        noEJB.setIsbn("654321");

        Author rodSaved = authorRepository.save(rod);
        Book noEJBSaved = bookRepository.save(noEJB);

        //create associations
        ericSaved.getBooks().add(dddSaved);
        rodSaved.getBooks().add(noEJBSaved);
        dddSaved.getAuthors().add(ericSaved);
        noEJBSaved.getAuthors().add(rodSaved);

        //create publishers
        Publisher publisher = new Publisher();
        publisher.setName("AnUsman");
        publisher.setAddress("Random Address");
        publisher.setCity("Random City");
        publisher.setState("Random State");
        publisher.setZip("L1T08R");
        Publisher savedPublisher = publisherRepository.save(publisher);

        dddSaved.setPublisher(savedPublisher);
        noEJBSaved.setPublisher(savedPublisher);

        authorRepository.save(ericSaved);
        authorRepository.save(rodSaved);
        bookRepository.save(dddSaved);
        bookRepository.save(noEJBSaved);

        log.info("In bootstrap method");
        log.info("Authors count: {}", authorRepository.count());
        log.info("Books count: {}", bookRepository.count());
        log.info("Publishers count: {}", publisherRepository.count());
    }
}
