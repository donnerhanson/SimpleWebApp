package com.springwebapp.spring5webapp.repositories;

import com.springwebapp.spring5webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
