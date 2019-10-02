package com.dartsip.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dartsip.test.domain.Book;
import com.dartsip.test.service.BookService;

@RestController
@RequestMapping("/books")
public class BookController {
	
	private BookService bookService;
	
	public BookController(BookService bookService)
	{
		this.bookService = bookService;
	}

	@GetMapping("/list")
	public Iterable<Book> list()
	{
		return bookService.list();
	}
}
