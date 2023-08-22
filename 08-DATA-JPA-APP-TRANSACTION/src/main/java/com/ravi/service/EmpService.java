package com.ravi.service;

import com.ravi.entities.Address;
import com.ravi.entities.Emp;
import com.ravi.repository.AddressRepository;
import com.ravi.repository.EmpRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpService {
    @Autowired
    private EmpRepository empRepository;
    @Autowired
    private AddressRepository addressRepository;

    @Transactional(rollbackOn = Exception.class)
    public void saveRecord() {

        Emp emp = new Emp("Sohan", 20000.45);
        empRepository.save(emp);
//        int x = 10/0;
        Address address = new Address("Indore", "MP", "India", emp.getEmpId());
        addressRepository.save(address);
    }
}
