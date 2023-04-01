package com.example.demo.services;

import com.example.demo.entity.AdministrativeCoordinator;
import com.example.demo.repository.UserRepository;
import com.example.demo.usecases.AddAdministrativeCoordinatorUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddAdministrativeCoordinatorService implements AddAdministrativeCoordinatorUseCase {

    @Autowired
    private UserRepository userRepository;


    @Override
    public void addAdministrativeCoordinator(AdministrativeCoordinator administrativeCoordinator) {
        userRepository.save(administrativeCoordinator);

    }
}
