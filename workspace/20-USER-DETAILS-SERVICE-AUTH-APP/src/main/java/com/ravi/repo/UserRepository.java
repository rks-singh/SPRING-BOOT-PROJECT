package com.ravi.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ravi.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	public Optional<User> findByUserEmail(String userEmail);
	
	public Optional<User> findByUserName(String userName);
}
