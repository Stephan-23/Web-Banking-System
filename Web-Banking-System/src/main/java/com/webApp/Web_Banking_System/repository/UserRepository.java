package com.webApp.Web_Banking_System.repository;

import com.webApp.Web_Banking_System.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserId(String userId); // For login lookup
}
