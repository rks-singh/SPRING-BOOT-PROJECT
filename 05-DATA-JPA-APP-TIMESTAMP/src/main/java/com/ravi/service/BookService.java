package com.ravi.service;

import com.ravi.entities.Book;
import com.ravi.repositiory.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public void storeBook() {
        Book entity = new Book();

        entity.setBookName("Java");
        entity.setBookPrice(3000.54);
        entity.setActiveSwitch("Y");
        bookRepository.save(entity);


        // 1st approach to update record. It is not a recommended approach to update record
        // because, if we won't set any value for column that column become null.
        /*
         entity.setBookId(1);
        entity.setBookPrice(2000.55);
        bookRepository.save(entity);*/

        // 2nd approach to update record.
        /*Book book = bookRepository.findById(1).get();

        book.setBookPrice(2000.50);
        book.setBookName("Java");
        bookRepository.save(book);*/

        // 3rd approach using custom query.
    }
    public void updateBookPrice(){
        int result = bookRepository.updateBookPrice(3000.60, 1);
        if (result >= 0) {
            System.out.println("Record Updated..");
        }else {
            System.out.println("Record not updated..");
        }
    }

    public void updateActiveSwitch(String value, int key) {
        Book book = bookRepository.findById(key).get();
        book.setActiveSwitch(value);
        bookRepository.save(book);
    }
}
