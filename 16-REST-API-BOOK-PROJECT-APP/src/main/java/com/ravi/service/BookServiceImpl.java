package com.ravi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ravi.binding.Book;
import com.ravi.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookRepository;

	@Override
	public String saveAndUpdateBook(Book book) {
		// TODO Auto-generated method stub
		Integer bookId = book.getBookId();
		if (bookId == null) {
			bookRepository.save(book);
			return "Data saved Successfully";
		} else {
			bookRepository.save(book);
			return "Data updated Successfully";
		}
	}

	@Override
	public List<Book> getAllBook() {
		// TODO Auto-generated method stub
		return bookRepository.findAll();
	}

	@Override
	public Book getBook(Integer bookId) {
		// TODO Auto-generated method stub
		Optional<Book> book = bookRepository.findById(bookId);
		if (book.isPresent()) {
			return book.get();
		}
		return null;
	}

	@Override
	public String deleteBook(Integer bookId) {
		// TODO Auto-generated method stub
		if (bookRepository.existsById(bookId)) {
			bookRepository.deleteById(bookId);
			return "Deleated Successfully";
		} else {
			return "No record found.!!";
		}
	}

}
