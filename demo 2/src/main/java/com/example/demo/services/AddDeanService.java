package com.example.demo.services;

import com.example.demo.entity.Dean;
import com.example.demo.repository.UserRepository;
import com.example.demo.usecases.AddDeanUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddDeanService implements AddDeanUseCase {
    @Autowired
    private UserRepository userRepository;
    @Override
    public void addDean(Dean dean) {
        userRepository.save(dean);
    }
}
