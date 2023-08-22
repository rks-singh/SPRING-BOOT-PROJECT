package com.ravi.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bookId;
    private String bookName;
    private Double bookPrice;
    @CreationTimestamp
    @Column(updatable = false)
    //@Temporal(TemporalType.TIMESTAMP) // ==> convert java date and time object to mysql data and time.
    //@DateTimeFormat(pattern = "DD-MM-YYYY HH:mm:SS")
    private LocalDateTime createDate;
    @UpdateTimestamp
    @Column(insertable = false)
    //@Temporal(TemporalType.TIMESTAMP)
    //@DateTimeFormat(pattern = "dd-MM-yyy HH:mm:ss")
    private LocalDateTime updateDate;

    private String activeSwitch;

    public Book() {}

    public Book(Integer bookId, String bookName, Double bookPrice, String activeSwitch) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookPrice = bookPrice;
        this.activeSwitch = activeSwitch;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(Double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getActiveSwitch() {
        return activeSwitch;
    }

    public void setActiveSwitch(String activeSwitch) {
        this.activeSwitch = activeSwitch;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", bookPrice=" + bookPrice +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                ", activeSwitch='" + activeSwitch + '\'' +
                '}';
    }
}
