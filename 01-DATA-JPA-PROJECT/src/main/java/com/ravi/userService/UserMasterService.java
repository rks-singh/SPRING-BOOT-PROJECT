package com.ravi.userService;

import com.ravi.entities.UserMasterEntity;
import com.ravi.userMasterRepository.UserMasterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Arrays;
import java.util.Optional;

@Service
public class UserMasterService {

    @Autowired
    private UserMasterRepository userMasterRepository;

    public void insertData() {
        UserMasterEntity user1 =
                new UserMasterEntity(101,"Ravi Singh","ravi@gamil.com","Male","Jabalpur",22);

        UserMasterEntity user2 =
                new UserMasterEntity(102,"Sohan Singh","sohan@gmail.com","Male","Indore",24);

        UserMasterEntity user3 =
                new UserMasterEntity(103, "Rohan Singh", "rohan@gmail.com", "Male", "Bhopal", 21);

        UserMasterEntity user4 =
                new UserMasterEntity(104,"Deepak","deepak@gmailcom","Male","Gorakhpur",25);

        UserMasterEntity user5 =
                new UserMasterEntity(105, "Sarita", "sarita@gmail.com", "Female", "Mumbai", 23);

        // save() => used to upsert(Insert + update) single record.
        userMasterRepository.save(user1);
        // saveAll() ==> used to upsert(Insert + update) multiple record into table.
        userMasterRepository.saveAll(Arrays.asList(user2,user3,user4,user5));
    }
    public void findById() {

        // findById() ==> used to get single record using primary key. return optional<T>
        Optional<UserMasterEntity> byId = userMasterRepository.findById(101);
        byId.ifPresent(System.out::println);
    }

    public  void findAllById() {
        //findAllById() ==> used to retrieve multiple record using multiple primary key, return type is Iterable<T>
        Iterable<UserMasterEntity> allById = userMasterRepository.findAllById(Arrays.asList(102, 104, 105));
        allById.forEach(System.out::println);
    }

    public void findALl() {
       // findALl() ==> used to retrieve all record from table , return type is Iterable<T>
        Iterable<UserMasterEntity> all = userMasterRepository.findAll();
        all.forEach(System.out::println);
    }
    public void count() {
       // count() ==> used to get total count of record in a table. return type is long
        long count = userMasterRepository.count();
        System.out.println("Total no. of record in a table : "+count);
    }
    public void existById() {
       // existById() ==> used to check whether given record present or not using primary key. return type is boolean.
        boolean isPresent = userMasterRepository.existsById(101);
        System.out.println("User is present with id 101 :"+isPresent);
    }

    public void deleteById() {
        //deleteById() ==> used to delete single record using primary key. return type is void.
        userMasterRepository.deleteById(101);
    }
    public void deleteAllById() {
        // deleteById() ==> Used to delete multiple record using multiple primary key. return type is void
        userMasterRepository.deleteAllById(Arrays.asList(102,103,105));
    }

    public void deleteALL() {
        // deleteAll() ==> used to delete all record from table. return type is void.
        userMasterRepository.deleteAll();
    }

    public void delete() {
        // delete() ==> used to delete record using given object. return type is void.
//        userMasterRepository.delete(user1);
    }
}
