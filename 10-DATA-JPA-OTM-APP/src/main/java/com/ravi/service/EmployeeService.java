package com.ravi.service;

import com.ravi.entities.Address;
import com.ravi.entities.Employee;
import com.ravi.repository.AddressRepository;
import com.ravi.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private AddressRepository addressRepository;

    public void storeRecord() {
        Address a1 = new Address();
        a1.setCity("Jabalpur");
        a1.setState("M.P");
        a1.setType("Permanent");

        Address a2 = new Address();
        a2.setCity("Hyderabad");
        a2.setState("TEl");
        a2.setType("Present");

        List<Address> list = Arrays.asList(a1, a2);

        Employee e1 = new Employee();
        e1.setEmployeeName("Ravi");
        e1.setEmployeeSalary(30000.45);
        e1.setAddresses(list);

        a1.setEmployee(e1);
        a2.setEmployee(e1);

        employeeRepository.save(e1);
    }

    public void getRecord(int key) {
        Optional<Employee> byId = employeeRepository.findById(key);
    }

    public void getAddressRecord(int key) {
        Optional<Address> byId = addressRepository.findById(key);
    }

    public void deleteEmployee(int key) {
        employeeRepository.deleteById(key);
    }

    public void deleteAddress(int key) {
        addressRepository.deleteById(key);
    }
}
