package com.example.demo.services;

import com.example.demo.entity.ProgramCoordinator;
import com.example.demo.repository.UserRepository;
import com.example.demo.usecases.AddProgramCoordinatorUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddProgramCoordinatorService implements AddProgramCoordinatorUseCase {
    @Autowired
    private UserRepository userRepository;
    @Override
    public void addProgramCoordinator(ProgramCoordinator programCoordinator) {
        userRepository.save(programCoordinator);
    }
}
