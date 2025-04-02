package com.webApp.Web_Banking_System.controller;

import com.webApp.Web_Banking_System.Service.UserService;
import com.webApp.Web_Banking_System.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/login")
public class LoginController {
    @Autowired
    private UserService userService;

    @PostMapping
    public String login(@RequestBody LoginRequest loginRequest) {
        User user = userService.login(loginRequest.getUserId(), loginRequest.getPassword());
        if (user != null) {
            return "Login successful for user: " + user.getUserId();
        }
        return "Login failed: Invalid credentials";
    }
}

// Helper class for request body
class LoginRequest {
    private String userId;
    private String password;

    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
}