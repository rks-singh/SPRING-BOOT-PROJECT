package com.ravi.service;

import com.ravi.entities.Employee;
import com.ravi.repositiory.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public void saveRecord() throws Exception {

        String imagePath = "F:\\SPRING_BOOT_PROJECT\\07-DATA-JPA-PROJECT\\src\\main\\resources\\image.jpeg";
        String resumePath = "F:\\SPRING_BOOT_PROJECT\\07-DATA-JPA-PROJECT\\src\\main\\resources\\Ravi singh Resume.pdf";

        Employee employee = new Employee();
        employee.setEmployeeName("Ravi Singh");
        employee.setEmployeeEmail("ravisingh@gmail.com");

        long imageSize = Files.size(Paths.get(imagePath));
        long resumeSize = Files.size(Paths.get(resumePath));

        // reading image from file
        byte[] image = new byte[(int)imageSize];
        FileInputStream fis1 = new FileInputStream(new File(imagePath));
        fis1.read(image);
        fis1.close();

        // reading pdf file.
        byte[] resume = new byte[(int)resumeSize];
        FileInputStream fis2 = new FileInputStream(new File(resumePath));
        fis2.read(resume);
        fis2.close();

        // setting image to entity object.
        employee.setEmployeePhoto(image);
        // setting resume to entity object.
        employee.setEmployeeResume(resume);

        employeeRepository.save(employee);
    }
}
