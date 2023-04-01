package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.usecases.AddStudentUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class StudentController {

    @Autowired
    private AddStudentUseCase addStudentUseCase;

    @GetMapping("/allStudents")
    List<Student> getAllStudent(){
        return addStudentUseCase.getAllStudent();
    }

    @PostMapping("/addStudent")
    void postStudent(@RequestBody Student student){
        addStudentUseCase.addStudent(student);
    }

}
