package com.example.demo.controller;

import com.example.demo.entity.AdministrativeCoordinator;
import com.example.demo.entity.Student;
import com.example.demo.usecases.AddAdministrativeCoordinatorUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AdministrativeCoordinatorController {

    @Autowired
    private AddAdministrativeCoordinatorUseCase addAdministrativeCoordinatorUseCase;

    @PostMapping("/addAdministrativeCoordinator")
    void postStudent(@RequestBody AdministrativeCoordinator administrativeCoordinator){
        addAdministrativeCoordinatorUseCase.addAdministrativeCoordinator(administrativeCoordinator);
    }
}
