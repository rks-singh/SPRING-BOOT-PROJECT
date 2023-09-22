package com.ravi.service;

import java.util.List;

import com.ravi.binding.Book;

public interface BookService {

	public String saveAndUpdateBook(Book book);

	public List<Book> getAllBook();

	public Book getBook(Integer bookId);

	public String deleteBook(Integer bookId);
}
