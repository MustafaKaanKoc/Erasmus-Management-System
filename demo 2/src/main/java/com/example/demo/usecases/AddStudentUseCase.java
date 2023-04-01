package com.example.demo.usecases;

import com.example.demo.entity.Student;

import java.util.List;

public interface AddStudentUseCase {
    List<Student> getAllStudent();
    void addStudent(Student student);
}
