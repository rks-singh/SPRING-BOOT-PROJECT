package com.ravi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ravi.binding.UserBinding;

public interface UserRepository extends JpaRepository<UserBinding, Integer> {
	
	@Query("select email from UserBinding where email = :email")
	public String getUserEmail(String email);
	
	@Query("select password from UserBinding where password = :password")
	public String getUserPassword(String password);
}
