package com.springwebapp.spring5webapp.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * JOPO Book Class Many to Many Relationship with the Author Class
 * @since 04-09-2021
 * @version 0.1
 * @author Donner
 */
@Entity // this tag means that this entity will be stored in the persistent db
public class Book {
    /**
     * the id assigned by the db to the Book
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    /**
     * the title of the book
     */
    private String title;
    /**
     * the ISBN of the book
     */
    private String isbn;
    /**
     * the authors of the book
     */
    @ManyToMany
    @JoinTable (name = "author_book", joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "author_id")  )
    private Set<Author> authors = new HashSet<>();
    @ManyToOne
    private Publisher publisher;
    /**
     * Default constructor
     */
    public Book() {
    }

    /**
     * Overloaded constructor
     * @param title String
     * @param isbn String
     * @param authors Set of Author objects
     */
    public Book(String title, String isbn, Set<Author> authors) {
        this.title = title;
        this.isbn = isbn;
        this.authors = authors;
    }

    public Book(String title, String isbn) {
        this.title = title;
        this.isbn = isbn;
    }
    /**
     * get the id of the book
     * @return int id
     */
    public Long getId() {
        return id;
    }

    /**
     * set the id
     * @param id int
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * get the title
     * @return title String
     */
    public String getTitle() {
        return title;
    }

    /**
     * set the title
     * @param title String
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * get the isbn of the book
     * @return isbn String
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * set the isbn
     * @param isbn
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * get the set of authors
     * @return authors Set of type Authors
     */
    public Set<Author> getAuthors() {
        return authors;
    }

    /**
     * set the authors set
     * @param authors set of type Author
     */
    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }

    /**
     * Get a representation of the Book as a string
     * @return String
     */
    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }

    /**
     * test if this object equals another object
     * @param o another object
     * @return bool
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        return Objects.equals(id, book.id);
    }

    /**
     * hash the id
     * @return hashCode
     */
    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }
}
