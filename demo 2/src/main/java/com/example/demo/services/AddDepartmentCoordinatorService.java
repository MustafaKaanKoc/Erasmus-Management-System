package com.example.demo.services;

import com.example.demo.entity.DepartmentCoordinator;
import com.example.demo.repository.UserRepository;
import com.example.demo.usecases.AddDepartmentCoordinatorUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddDepartmentCoordinatorService implements AddDepartmentCoordinatorUseCase {
    @Autowired
    private UserRepository userRepository;
    @Override
    public void addDepartmentCoordinator(DepartmentCoordinator departmentCoordinator) {
        userRepository.save(departmentCoordinator);
    }
}
