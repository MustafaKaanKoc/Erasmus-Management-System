package com.example.demo.controller;

import com.example.demo.entity.Feedback;
import com.example.demo.entity.Student;
import com.example.demo.usecases.SendFeedbackUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendFeedbackController {
    @Autowired
    private SendFeedbackUseCase sendFeedbackUseCase;

    @PostMapping("/sendFeedback")
    void postStudent(@RequestBody Feedback feedback){
        sendFeedbackUseCase.sendFeedBack(feedback);
    }
}
