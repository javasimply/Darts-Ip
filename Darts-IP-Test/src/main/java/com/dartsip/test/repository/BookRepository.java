package com.dartsip.test.repository;

import org.springframework.data.repository.CrudRepository;

import com.dartsip.test.domain.Book;

public interface BookRepository extends CrudRepository<Book,Long> {

}
