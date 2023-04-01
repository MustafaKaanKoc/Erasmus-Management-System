package com.example.demo.controller;

import com.example.demo.entity.DepartmentCoordinator;
import com.example.demo.entity.Student;
import com.example.demo.usecases.AddDepartmentCoordinatorUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DepartmentCoordinatorController {
    @Autowired
    private AddDepartmentCoordinatorUseCase addDepartmentCoordinatorUseCase;

    @PostMapping("/addDepartmentCoordinator")
    void postStudent(@RequestBody DepartmentCoordinator departmentCoordinator){
        addDepartmentCoordinatorUseCase.addDepartmentCoordinator(departmentCoordinator);
    }

}
