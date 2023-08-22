package com.ravi.repositiory;

import com.ravi.entities.Book;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface BookRepository extends JpaRepository<Book,Integer> {

    @Transactional
    @Modifying
    @Query(value = "update Book set bookPrice =:price where bookId =:id")
    public int updateBookPrice(double price, int id);
}
