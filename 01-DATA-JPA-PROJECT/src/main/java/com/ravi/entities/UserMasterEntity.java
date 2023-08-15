package com.ravi.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user_master")
public class UserMasterEntity {
    @Column(name="user_id")
    @Id
    private int user_id;
    @Column(name="user_name")
    private String user_name;
    @Column(name="user_email")
    private String user_email;
    @Column(name="user_gender")
    private String user_gender;
    @Column(name="user_city")
    private String user_city;
    @Column(name="user_age")
    private int user_age;

    public UserMasterEntity(){ }
    public UserMasterEntity(int user_id, String user_name, String user_email, String user_gender, String user_city, int user_age) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_email = user_email;
        this.user_gender = user_gender;
        this.user_city = user_city;
        this.user_age = user_age;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getUser_gender() {
        return user_gender;
    }

    public void setUser_gender(String user_gender) {
        this.user_gender = user_gender;
    }

    public String getUser_city() {
        return user_city;
    }

    public void setUser_city(String user_city) {
        this.user_city = user_city;
    }

    public int getUser_age() {
        return user_age;
    }

    public void setUser_age(int user_age) {
        this.user_age = user_age;
    }

    @Override
    public String toString() {
        return "UserMasterEntity{" +
                "user_id=" + user_id +
                ", user_name='" + user_name + '\'' +
                ", user_email='" + user_email + '\'' +
                ", user_gender='" + user_gender + '\'' +
                ", user_city='" + user_city + '\'' +
                ", user_age=" + user_age +
                '}';
    }
}
