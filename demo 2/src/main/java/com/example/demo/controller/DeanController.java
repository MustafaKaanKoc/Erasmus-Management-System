package com.example.demo.controller;

import com.example.demo.entity.Dean;
import com.example.demo.entity.Student;
import com.example.demo.usecases.AddDeanUseCase;
import com.example.demo.usecases.AddStudentUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DeanController {
    @Autowired
    private AddDeanUseCase addDeanUseCase;

    @PostMapping("/addDean")
    void postStudent(@RequestBody Dean dean){
        addDeanUseCase.addDean(dean);
    }

}
