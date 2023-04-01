package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@Table(name="users")
public class User {
    private String mail;
    private String password;
    private String name;
    private String surname;
    private boolean isLoggedIn;
    private int id;
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long userId;
    public User() {

    }
}
