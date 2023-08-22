package com.ravi.service;

import com.ravi.entities.Person;
import com.ravi.entities.PersonPk;
import com.ravi.repositiory.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public void saveRecord() {

        PersonPk personPk = new PersonPk();
        personPk.setAadhaarNo(123456789L);
        personPk.setPassportNo("EM12387X");

        Person person = new Person();
        person.setName("Ravi Singh");
        person.setEmail("ravi@gmail.com");
        person.setPersonPk(personPk);

        personRepository.save(person);
    }

    public void getRecord() {
        PersonPk personPk = new PersonPk();
        personPk.setAadhaarNo(123456789L);
        personPk.setPassportNo("EM12387X");

        Optional<Person> person = personRepository.findById(personPk);
        person.ifPresent(System.out::println);
    }
}
