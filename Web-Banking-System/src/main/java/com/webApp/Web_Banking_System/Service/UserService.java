package com.webApp.Web_Banking_System.Service;


import com.webApp.Web_Banking_System.model.User;
import com.webApp.Web_Banking_System.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User login(String userId, String password) {
        User user = userRepository.findByUserId(userId);
        if (user != null && user.getPassword().equals(password)) { // Plain text for now; use hashing later
            return user;
        }
        return null; // Login failed
    }
}

