package com.ravi.restcontroller;

import java.util.Collection;
import java.util.Map;

import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ravi.model.Book;

@RestController
public class BookController {

	private HashOperations<String, Integer, Book> hashOperations = null;

	public BookController(RedisTemplate<String, Book> redisTemplate) {
		this.hashOperations = redisTemplate.opsForHash();
	}

	@PostMapping("/book")
	public ResponseEntity<String> addBook(@RequestBody Book book) {
		hashOperations.put("Books", book.getBookId(), book);
		return new ResponseEntity<>("Book Saved...", HttpStatus.CREATED);
	}

	@GetMapping("/book/{bookId}")
	public ResponseEntity<Book> getBook(@PathVariable("bookId") Integer bookId) {
		Book book = hashOperations.get("Books", bookId);
		return new ResponseEntity<>(book, HttpStatus.OK);
	}

	@GetMapping("/books")
	public ResponseEntity<Collection<Book>> getAllBooks() {
		Map<Integer, Book> entries = hashOperations.entries("Books");
		Collection<Book> values = entries.values();
		return new ResponseEntity<>(values, HttpStatus.OK);
	}

	@DeleteMapping("/book/{bookId}")
	public ResponseEntity<String> deleteBook(@PathVariable("bookId") Integer bookId) {
		hashOperations.delete("Books", bookId);
		return new ResponseEntity<>("Book Deleted", HttpStatus.OK);
	}
}
