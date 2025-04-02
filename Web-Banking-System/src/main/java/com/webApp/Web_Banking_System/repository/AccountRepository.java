package com.webApp.Web_Banking_System.repository;

import com.webApp.Web_Banking_System.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountRepository extends JpaRepository<Account, Long> {
    List<Account> findByUserId(Long userId); // Fetch accounts for a user
}


