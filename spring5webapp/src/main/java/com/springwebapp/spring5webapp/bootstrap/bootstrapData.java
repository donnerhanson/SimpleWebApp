package com.springwebapp.spring5webapp.bootstrap;

import com.springwebapp.spring5webapp.domain.Author;
import com.springwebapp.spring5webapp.domain.Book;
import com.springwebapp.spring5webapp.domain.Publisher;
import com.springwebapp.spring5webapp.repositories.AuthorRepository;
import com.springwebapp.spring5webapp.repositories.BookRepository;
import com.springwebapp.spring5webapp.repositories.PublisherRepository;
import org.apache.tomcat.jni.Address;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
// tells spring to detect this

@Component
public class bootstrapData implements CommandLineRunner {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public bootstrapData(AuthorRepository authorRepository, BookRepository bookRepository,
                         PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author eric = new Author("Eric","Evans");
        Book ddd = new Book("Domain Driven Design","123123123");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);


        Publisher publisher = new Publisher("Penguin", "testAddr 123432", "testCity", "Test State", 23123);
        publisherRepository.save(publisher);


        publisher.getBooks().add(ddd);
        ddd.setPublisher(publisher);

        authorRepository.save(eric);
        bookRepository.save(ddd);

        Author rod = new Author("Rod", "Johnson");
        Book noEjb = new Book("J2EE Development without EJB", "24344351");


        rod.getBooks().add(noEjb);
        noEjb.getAuthors().add(rod);
        noEjb.setPublisher(publisher);

        noEjb.setPublisher(publisher);
        publisher.getBooks().add(noEjb);

        Author test = new Author("test", "test");
        test.getBooks().add(noEjb);


        authorRepository.save(test);


        authorRepository.save(rod);
        bookRepository.save(noEjb);
        noEjb.getAuthors().add(test);
        bookRepository.save(noEjb);
        publisherRepository.save(publisher);




        System.out.println("Started in Bootstrap");
        System.out.println("Number of books: " + bookRepository.count());
        System.out.println("Number of authors: " + authorRepository.count());
        System.out.println("Number of publishers: " + publisherRepository.count());
        System.out.println("Publishers number of books: " + publisher.getBooks().size());

    }
}
