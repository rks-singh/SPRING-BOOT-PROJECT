package com.ravi.service;

import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.ravi.entity.User;
import com.ravi.repo.UserRepository;

@Service
public class UserServiceImpl implements IUserService, UserDetailsService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	@Override
	public Integer saveUser(User user) {
		String userPasswd = user.getUserPasswd();
		String encodePassword = passwordEncoder.encode(userPasswd);
		user.setUserPasswd(encodePassword);
		user = userRepository.save(user);
		return user.getUserId();
	}
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Optional<User> user = userRepository.findByUserName(username);
		if(user.isEmpty()) {
			throw new UsernameNotFoundException("User with name "+username+" not found");
		}else {
			User user2 = user.get();
			return new org.springframework.security.core.userdetails.User(
					user2.getUserName(),
					user2.getUserPasswd(), 
					user2.getUserRoles()
						.stream()
						.map(role -> new SimpleGrantedAuthority(role))
						.collect(Collectors.toSet())
					);
		}
	}


}
