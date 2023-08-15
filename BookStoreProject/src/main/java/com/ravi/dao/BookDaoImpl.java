package com.ravi.dao;
import com.ravi.bean.Book;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
@Repository
public class BookDaoImpl implements BookDao{

    @Value("${DB_URL}")
    private String DB_URL;
    @Value("${DB_USER}")
    private String DB_User;
    @Value("${DB_PASSWORD}")
    private String DB_PASSWORD;

    @Override
    public int storeBook(Book book) {
        try {
            Connection connection = DriverManager.getConnection(DB_URL, DB_User, DB_PASSWORD);
            PreparedStatement ps = connection.prepareCall("insert into bookstore values(?,?,?)");
            ps.setInt(1, book.getBookId());
            ps.setString(2, book.getBookName());
            ps.setInt(3, book.getBookPrice());

            return  ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}
