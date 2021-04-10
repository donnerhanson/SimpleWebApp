package com.springwebapp.spring5webapp.bootstrap;

import com.springwebapp.spring5webapp.domain.Author;
import com.springwebapp.spring5webapp.domain.Book;
import com.springwebapp.spring5webapp.repositories.AuthorRepository;
import com.springwebapp.spring5webapp.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
// tells spring to detect this

@Component
public class bootstrapData implements CommandLineRunner {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public bootstrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author eric = new Author("Eric","Evans");
        Book ddd = new Book("Domain Driven Design","123123123");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(ddd);

        Author rod = new Author("Rod", "Johnson");
        Book noEjb = new Book("J2EE Development without EJB", "24344351");
        Author test = new Author("test", "test");

        rod.getBooks().add(noEjb);
        test.getBooks().add(noEjb);
        noEjb.getAuthors().add(rod);
        noEjb.getAuthors().add(test);


        authorRepository.save(rod);
        authorRepository.save(test);
        bookRepository.save(noEjb);

        System.out.println("Started in Bootstrap");
        System.out.println("Number of books: " + bookRepository.count());
        System.out.println("Number of authors: " + authorRepository.count());

    }
}
