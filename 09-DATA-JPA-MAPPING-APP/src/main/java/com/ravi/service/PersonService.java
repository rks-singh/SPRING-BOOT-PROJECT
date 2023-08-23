package com.ravi.service;

import com.ravi.repositiory.PassportRepository;
import com.ravi.repositiory.PersonRepository;
import com.ravi.utilities.Passport;
import com.ravi.utilities.Person;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sound.midi.SysexMessage;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;
    @Autowired
    private PassportRepository passportRepository;

    public void storeRecord() {
        Person person = new Person();
        person.setPersonName("Ravi");
        person.setPersonAge(23);


        Passport passport = new Passport();
        passport.setPassportNum("EM979797");
        passport.setIssueDate(LocalDate.now());
        passport.setExpDate(LocalDate.now().plusYears(10));

        passport.setPerson(person);

        passportRepository.save(passport);
    }

    public void getRecord(int key) {
        Optional<Passport> all = passportRepository.findById(key);
        all.ifPresent(System.out::println);
    }

}