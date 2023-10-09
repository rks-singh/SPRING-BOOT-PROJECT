package com.ravi.service;

import com.ravi.binding.UserBinding;
import com.ravi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void saveUser(UserBinding user) {
        userRepository.save(user);
    }
    public String getUserEmail(String email) {
        return userRepository.getUserEmail(email);
    }

    public String getUserPassword(String password) {
        return userRepository.getUserPassword(password);
    }

    public String getUserName(String email) {
        return userRepository.getUserName(email);
    }
}
