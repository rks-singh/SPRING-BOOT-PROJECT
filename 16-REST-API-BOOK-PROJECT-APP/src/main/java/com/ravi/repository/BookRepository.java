package com.ravi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ravi.binding.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
