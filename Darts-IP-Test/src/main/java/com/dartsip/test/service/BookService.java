package com.dartsip.test.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dartsip.test.domain.Book;
import com.dartsip.test.repository.BookRepository;

@Service
public class BookService {
	
	private BookRepository bookRepository;

	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	public Iterable<Book> list()
	{
		return bookRepository.findAll();
	}
	
	public Book save(Book book)
	{
		return bookRepository.save(book);
	}

	public Iterable<Book> saveAll(List<Book> books) {
	
		return bookRepository.saveAll(books);
		
	}

}
