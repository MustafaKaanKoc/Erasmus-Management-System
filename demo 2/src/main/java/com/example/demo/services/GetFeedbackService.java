package com.example.demo.services;

import com.example.demo.entity.Feedback;
import com.example.demo.entity.Student;
import com.example.demo.repository.UserRepository;
import com.example.demo.usecases.GetFeedbackUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetFeedbackService implements GetFeedbackUseCase{
    @Autowired
    UserRepository userRepository;

    //BURASI DEĞİŞECEK
    public Feedback getFeedback(Student student){
        Feedback feedback = ((Student)(userRepository.findById(student.getUserId()).get())).getFeedback();
        return feedback;
    }


}
