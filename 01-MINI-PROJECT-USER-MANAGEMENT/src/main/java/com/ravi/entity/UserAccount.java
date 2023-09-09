package com.ravi.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import java.time.LocalDate;


// ========== Binding + Entity class ==============
@Entity
@Table(name = "user_account")
public class UserAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;
    private String gender;
    private Long number;
    private Long ssn;
    private LocalDate dob;
    private String activeSwitch;
    @CreationTimestamp
    @Column(updatable = false)
    private LocalDate creationData;
    @UpdateTimestamp
    @Column(insertable = false)
    private LocalDate updateDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public Long getSsn() {
        return ssn;
    }

    public void setSsn(Long ssn) {
        this.ssn = ssn;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getActiveSwitch() {
        return activeSwitch;
    }

    public void setActiveSwitch(String activeSwitch) {
        this.activeSwitch = activeSwitch;
    }

    public LocalDate getCreationData() {
        return creationData;
    }

    public void setCreationData(LocalDate creationData) {
        this.creationData = creationData;
    }

    public LocalDate getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDate updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public String toString() {
        return """
                UserAccount{\
                Id=\
                """ + id +
                ", Name='" + name + '\'' +
                ", Email='" + email + '\'' +
                ", Gender='" + gender + '\'' +
                ", Number=" + number +
                ", Ssn=" + ssn +
                ", Dob=" + dob +
                ", ActiveSwitch='" + activeSwitch + '\'' +
                ", CreationData=" + creationData +
                ", UpdateDate=" + updateDate +
                '}';
    }
}
