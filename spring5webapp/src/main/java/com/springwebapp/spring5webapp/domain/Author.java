package com.springwebapp.spring5webapp.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * JOPO Author Class Many to Many Relationship with the Book Class
 * @since 04-09-2021
 * @version 0.1
 * @author Donner
 */
@Entity
public class Author {

    /**
     * the id assigned by the db to the Book
     */
    @Id // lets persistence (I.E. the dB mngr know that this value is the primary key)
    @GeneratedValue(strategy = GenerationType.AUTO) // property is managed by the database
    private Long id;
    /**
     * The first name of an author
     */
    private String firstName;
    /**
     * the last name of an author
     */
    private String lastName;
    /**
     * the set of books an author has been associated with
     */
    @ManyToMany(mappedBy = "authors")
    private Set<Book> books = new HashSet<>();

    /**
     * Default constructor
     */
    public Author() {
    }

    /**
     * Overloaded constructor
     * @param firstName String
     * @param lastName String
     * @param books Set of book Objects
     */
    public Author(String firstName, String lastName, Set<Book> books) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.books = books;
    }

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * get the Id
     * @return id Long
     */
    public Long getId() {
        return id;
    }

    /**
     * set the ID
     * @param id Long
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Get the first name
     * @return firstName String
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Set the firstName
     * @param firstName String
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * get the last name
     * @return lastName String
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * set the last name
     * @param lastName String
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Get the Books associated with the author
     * @return books Set of book objects
     */
    public Set<Book> getBooks() {
        return books;
    }

    /**
     * Set the books associated with the author
     * @param books Set of book objects
     */
    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    /**
     * Get a representation of the Author information as a string
     * @return String
     */
    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", books=" + books +
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

        Author author = (Author) o;

        return Objects.equals(id, author.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

}
