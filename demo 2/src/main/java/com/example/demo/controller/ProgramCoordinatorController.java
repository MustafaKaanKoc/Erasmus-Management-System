package com.example.demo.controller;

import com.example.demo.entity.ProgramCoordinator;
import com.example.demo.entity.Student;
import com.example.demo.usecases.AddProgramCoordinatorUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ProgramCoordinatorController {
    @Autowired
    private AddProgramCoordinatorUseCase addProgramCoordinatorUseCase;

    @PostMapping("/addProgramCoordinator")
    void postStudent(@RequestBody ProgramCoordinator programCoordinator){
        addProgramCoordinatorUseCase.addProgramCoordinator(programCoordinator);
    }

}
