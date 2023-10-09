package com.ravi.repository;

import com.ravi.binding.UserBinding;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<UserBinding, Integer> {

    @Query("select email from UserBinding where email = :email")
    String getUserEmail(String email);

    @Query("select password from UserBinding where password = :password")
    String getUserPassword(String password);

    @Query("select name from UserBinding where email = :email")
    String getUserName(String email);
}
