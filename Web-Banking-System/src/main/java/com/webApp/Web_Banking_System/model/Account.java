package com.webApp.Web_Banking_System.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String accountNumber; // Unique account number
    private String accountType; // "MAIN", "SAVINGS", "FUTURES"
    private double balance;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user; // Links account to a user

    // Constraint: Max 4 accounts per user (enforced in service layer)
}
