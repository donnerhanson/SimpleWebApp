package com.springwebapp.spring5webapp.repositories; // spring data JPA provides the implementation

import com.springwebapp.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
