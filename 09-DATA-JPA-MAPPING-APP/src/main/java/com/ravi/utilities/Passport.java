package com.ravi.utilities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Passport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer passportId;
    private String passportNum;
    private LocalDate issueDate;
    private LocalDate expDate;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "person_id" ,referencedColumnName = "personId")
    private Person person;

    public Integer getPassportId() {
        return passportId;
    }

    public void setPassportId(Integer passportId) {
        this.passportId = passportId;
    }

    public String getPassportNum() {
        return passportNum;
    }

    public void setPassportNum(String passportNum) {
        this.passportNum = passportNum;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public LocalDate getExpDate() {
        return expDate;
    }

    public void setExpDate(LocalDate expDate) {
        this.expDate = expDate;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "passportId=" + passportId +
                ", passportNum='" + passportNum + '\'' +
                ", issueDate=" + issueDate +
                ", expDate=" + expDate +
                ", person=" + person +
                '}';
    }
}
