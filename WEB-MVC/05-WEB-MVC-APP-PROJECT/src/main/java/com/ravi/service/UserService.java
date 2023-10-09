package com.ravi.service;

import com.ravi.binding.User;
import com.ravi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    // add user
    public boolean addUser(User user) {
        userRepository.save(user);
        return user.getId()>0;
    }

    // get User
    public List<User> getUser() {
        return userRepository.findAll();
    }
}
