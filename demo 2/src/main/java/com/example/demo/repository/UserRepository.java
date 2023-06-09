package com.example.demo.repository;

import com.example.demo.entity.Personnel;
import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public
interface UserRepository extends JpaRepository<User, Long> {

}
