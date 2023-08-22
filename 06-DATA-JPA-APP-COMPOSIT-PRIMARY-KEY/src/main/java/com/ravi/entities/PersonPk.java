package com.ravi.entities;

import jakarta.persistence.Embeddable;


@Embeddable
public class PersonPk {
    private Long aadhaarNo;
    private String passportNo;

    public Long getAadhaarNo() {
        return aadhaarNo;
    }

    public void setAadhaarNo(Long aadhaarNo) {
        this.aadhaarNo = aadhaarNo;
    }

    public String getPassportNo() {
        return passportNo;
    }

    public void setPassportNo(String passportNo) {
        this.passportNo = passportNo;
    }

    @Override
    public String toString() {
        return "PersonPk{" +
                "AadhaarNo=" + aadhaarNo +
                ", PassportNo='" + passportNo + '\'' +
                '}';
    }
}
