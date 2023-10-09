package com.ravi.service;

import com.ravi.binding.User;
import com.ravi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void saveUser(User user) {
        userRepository.save(user);
    }

    public int getUserId(String userName) {
        return userRepository.getUserId(userName);
    }
}
