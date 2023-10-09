package com.ravi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ravi.binding.Book;

@RestController
public class BookController {

	/*
	@GetMapping("/book/{id}")
	public Book getBoook(@PathVariable("id") Integer id) {
		Book book = new Book(id, "Java", 1000.34);
		return book;
	}
	*/
	
	@GetMapping("/book/{id}")
	public ResponseEntity<Book> getBook(@PathVariable("id")Integer id){
		Book book = new Book(id,"Java",1000.34);
		return new ResponseEntity<>(book,HttpStatus.OK);
	}

	/*
	@GetMapping("/books")
	public List<Book> getBooks(){
		Book book1 = new Book(102,"C++",2500.45);
		Book book2 = new Book(103,"JAVA",3000.45);
		Book book3 = new Book(104,"PYTHON",1200.45);
		
		List<Book> books = Arrays.asList(book1,book2,book3);
		return books;
		
	}
	*/
	
	@GetMapping("/books")
	public ResponseEntity<List<Book>> getBooks(){
		Book book1 = new Book(102,"C++",2500.45);
		Book book2 = new Book(103,"JAVA",3000.45);
		Book book3 = new Book(104,"PYTHON",1200.45);
		
		List<Book> books = Arrays.asList(book1,book2,book3);
		return new ResponseEntity<>(books,HttpStatus.OK);
	}
	
	@PostMapping("/book")
	public ResponseEntity<String> saveBoook(@RequestBody Book book){
		System.out.println(book);
		return new ResponseEntity<>("Book Saved.!!",HttpStatus.CREATED);
	}

}
