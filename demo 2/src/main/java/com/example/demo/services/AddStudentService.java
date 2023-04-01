package com.example.demo.services;


import com.example.demo.entity.Student;
import com.example.demo.repository.UserRepository;
import com.example.demo.usecases.AddStudentUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class AddStudentService implements AddStudentUseCase {

    @Autowired
    private UserRepository userRepository;
    public List<Student> getAllStudent(){//userRepository.findAll();
        Student student = new Student("engineer", "cs",
                false, 3.40, new Date(), 0,
                "bilkent", 0, new Date());

        ArrayList<Student> list = new ArrayList<Student>();
        list.add(student);
        return list;

    }

    public void addStudent(Student student){
        userRepository.save(student);
    }

}
