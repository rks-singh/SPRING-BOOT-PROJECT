package com.ravi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ravi.binding.Book;
import com.ravi.service.BookService;

@RestController
public class BookController {

	@Autowired
	private BookService bookService;

	@PostMapping("/book")
	public ResponseEntity<String> createBookStore(@RequestBody Book book) {
		String status = bookService.saveAndUpdateBook(book);
		return new ResponseEntity<>(status, HttpStatus.CREATED);
	}

	@GetMapping("/books")
	public ResponseEntity<List<Book>> getAllBook() {
		List<Book> books = bookService.getAllBook();
		return new ResponseEntity<>(books, HttpStatus.OK);
	}

	@GetMapping("/book/{bookId}")
	public ResponseEntity<Book> getBook(@PathVariable("bookId") Integer bookId) {
		Book book = bookService.getBook(bookId);
		return new ResponseEntity<>(book, HttpStatus.OK);
	}

	@DeleteMapping("/book/{bookId}")
	public ResponseEntity<String> deleteBook(@PathVariable("bookId") Integer bookId) {
		String status = bookService.deleteBook(bookId);
		return new ResponseEntity<>(status, HttpStatus.OK);
	}
	
	@PutMapping("/book")
	public ResponseEntity<String> updateBook(@RequestBody Book book){
		String status = bookService.saveAndUpdateBook(book);
		return new ResponseEntity<>(status,HttpStatus.OK);
	}

}
