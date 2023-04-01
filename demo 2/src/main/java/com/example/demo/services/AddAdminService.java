package com.example.demo.services;

import com.example.demo.entity.Admin;
import com.example.demo.entity.Student;
import com.example.demo.repository.UserRepository;
import com.example.demo.usecases.AddAdminUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddAdminService implements AddAdminUseCase {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void addAdmin(Admin admin){
        userRepository.save(admin);
    }
}
