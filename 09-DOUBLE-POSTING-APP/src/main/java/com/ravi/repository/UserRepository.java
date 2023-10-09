package com.ravi.repository;

import com.ravi.binding.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User,Integer> {

    @Query(value = "select id from User where name = :userName")
    public int getUserId(String userName);
}
