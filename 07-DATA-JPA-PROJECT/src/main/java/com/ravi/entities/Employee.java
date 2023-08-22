package com.ravi.entities;

import jakarta.persistence.*;

import java.util.Arrays;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer employeeId;
    private String employeeName;
    private String employeeEmail;
    @Lob
    private byte[] employeePhoto;
    @Lob
    private  byte[] employeeResume;

    public Employee(){}

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public byte[] getEmployeePhoto() {
        return employeePhoto;
    }

    public void setEmployeePhoto(byte[] employeePhoto) {
        this.employeePhoto = employeePhoto;
    }

    public byte[] getEmployeeResume() {
        return employeeResume;
    }

    public void setEmployeeResume(byte[] employeeResume) {
        this.employeeResume = employeeResume;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", EmployeeName='" + employeeName + '\'' +
                ", EmployeeEmail='" + employeeEmail + '\'' +
                ", EmployeePhoto=" + Arrays.toString(employeePhoto) +
                ", EmployeeResume=" + Arrays.toString(employeeResume) +
                '}';
    }
}
