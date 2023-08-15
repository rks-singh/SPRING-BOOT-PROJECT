package com.ravi.service;

import com.ravi.bean.Book;
import com.ravi.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookDao bookDao;
    @Override
    public void getBook() {
        try {
            Book book = new Book();
            String filePath = "F:\\SPRING_BOOT_PROJECT\\BookStoreProject\\src\\book.txt";
            Stream<String> lines = Files.lines(Paths.get(filePath));
            lines.forEach(line->{
                String[] values = line.split(",");
                book.setBookId(Integer.parseInt(values[0]));
                book.setBookName(values[1]);
                book.setBookPrice(Integer.parseInt(values[2]));
                int count =bookDao.storeBook(book);
                if (count > 0) {
                    System.out.println("Data Inserted...");
                } else {
                    System.out.println("Data not Inserted...");
                }
            });

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
