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

    // inserting user data into database.
    public boolean storeUserRecord(User user) {
         userRepository.save(user);
         return user.getId()>0;
    }

    // getting all user record.
    public List<User> getUserRecord() {
        return userRepository.findAll();
    }

}
