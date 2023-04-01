package com.example.demo.services;

import com.example.demo.entity.Feedback;
import com.example.demo.entity.Student;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.usecases.SendFeedbackUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SendFeedbackService implements SendFeedbackUseCase{
    @Autowired
    private UserRepository userRepository;


    @Override
    public void sendFeedBack(Feedback feedback) {
        ((Student)userRepository.findById(feedback.getStudentId()).get()).setFeedback(feedback);
    }
}
