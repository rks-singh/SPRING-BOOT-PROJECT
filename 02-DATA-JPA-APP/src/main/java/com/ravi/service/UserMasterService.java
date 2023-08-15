package com.ravi.service;

import com.ravi.entities.UserMasterEntity;
import com.ravi.repositiory.UserMasterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;


@Service
public class UserMasterService {

    @Autowired
    private UserMasterRepository userMasterRepository;
    public void insertRecord() {
        UserMasterEntity user1 =
                new UserMasterEntity(101, "Ravi Singh", "ravi@gmail.com", "Male", "Jabalpur", 22);
        UserMasterEntity user2 =
                new UserMasterEntity(102, "Sohan Singh", "sohan@gmail.com", "Male", "Bhopal", 23);
        UserMasterEntity user3 =
                new UserMasterEntity(103, "Sarita", "sarita@gamil.com", "Female", "Jabalpur", 21);
        UserMasterEntity user4 =
                new UserMasterEntity(104, "Rohan Singh", "rohan@gmail.com", "Male", "Bhopal", 15);
        UserMasterEntity user5 =
                new UserMasterEntity(105, "Riya", "riya@gmail.com", "Female", "Indore", 20);

        userMasterRepository.saveAll(Arrays.asList(user1,user2,user3,user4,user5));
    }

    public void findByGender() {
        List<UserMasterEntity> gender = userMasterRepository.findByGender("male");
        gender.forEach(System.out::println);
    }
    public void findByCity() {
        List<UserMasterEntity> city = userMasterRepository.findByCity("Jabalpur");
        city.forEach(System.out::println);
    }
    public void findByGenderAndCity() {
        List<UserMasterEntity> genderAndCity = userMasterRepository.findByGenderAndCity("male", "jabalpur");
        genderAndCity.forEach(System.out::println);
    }

    public void findByAgeGreaterThanEqual() {
        List<UserMasterEntity> ageGreaterThenEqual = userMasterRepository.findByAgeGreaterThanEqual(22);
        ageGreaterThenEqual.forEach(System.out::println);
    }

    public void findByCityIn() {
        List<UserMasterEntity> byCityIn = userMasterRepository.findByCityIn(Arrays.asList("jabalpur", "Bhopal"));
        byCityIn.forEach(System.out::println);
    }
}
