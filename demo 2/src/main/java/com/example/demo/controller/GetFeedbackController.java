package com.example.demo.controller;

import com.example.demo.entity.Feedback;
import com.example.demo.entity.Student;
import com.example.demo.usecases.GetFeedbackUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GetFeedbackController {
    @Autowired
    private GetFeedbackUseCase getFeedbackUseCase;

    @GetMapping("/myFeedback")
    Feedback getFeedback(Student student){
        return getFeedbackUseCase.getFeedback(student);
    }
}
