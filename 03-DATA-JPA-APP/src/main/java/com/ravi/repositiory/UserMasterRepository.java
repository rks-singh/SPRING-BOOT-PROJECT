package com.ravi.repositiory;

import com.ravi.entities.UserMasterEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserMasterRepository extends CrudRepository<UserMasterEntity, Integer> {

    @Query(value = "from UserMasterEntity")
    public List<UserMasterEntity> getALlStudentHQL();

    @Query(value = "select * from user_master", nativeQuery = true)
    public List<UserMasterEntity> getAllStudentSQL();

    // =================================================================

    @Query(value = "from UserMasterEntity where city =:cname")
    public List<UserMasterEntity> getByCityHQL(String cname);

    @Query(value = "select * from user_master where user_city =:cname", nativeQuery = true)
    public List<UserMasterEntity> getByCitySQL(String cname);

    // =============================================================
    @Query(value = "select email from UserMasterEntity")
    public List<String> getAllEmailHQL();

    @Query(value = "select user_email from user_master", nativeQuery = true)
    public List<String> getALLEmailSQL();

    // =================================================================

    @Query(value = "select email,city from UserMasterEntity")
    public List<String> getAllEmailCity();

    //==================================================================

    @Query(value = "select name,email from UserMasterEntity where id =:id")
    public List<String> getNameAndEmailHQL(int id);

    @Query(value = "select user_name,user_email from user_master where user_id =:id",nativeQuery = true)
    public List<String> getNameAndEmailSQL(int id);

    @Query(value = "update UserMasterEntity set age =:age where name =:name")
    @Transactional
    @Modifying
    public int updateAge(int age, String name);

    @Query(value = "delete from UserMasterEntity where id =:id")
    @Transactional
    @Modifying
    public int deleteUser(int id);

}

