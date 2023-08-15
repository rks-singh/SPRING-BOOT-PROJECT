package com.ravi.repositiory;

import com.ravi.entities.UserMasterEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserMasterRepository extends CrudRepository<UserMasterEntity, Integer> {

    //Query ==> select * from user_master where user_gender = "male";
    List<UserMasterEntity> findByGender(String gender);

    //Query ==> select *from user_master where user_city = "Jabalpur"
    public List<UserMasterEntity> findByCity(String city);

    //Query ==> select * from user_master where user_gender="male" and user_city="jabalpur";
    public List<UserMasterEntity> findByGenderAndCity(String gender, String city);

    //Query ==> select * from master_user where age >=22;
    public List<UserMasterEntity> findByAgeGreaterThanEqual(int age);

    //Query ==> select * from master_user where user_city in(?,?);
    public List<UserMasterEntity> findByCityIn(List<String>city);
}
