package com.example.demo.usecases;

import com.example.demo.entity.Feedback;
import com.example.demo.entity.Student;

public interface GetFeedbackUseCase {
    Feedback getFeedback( Student student );
}
