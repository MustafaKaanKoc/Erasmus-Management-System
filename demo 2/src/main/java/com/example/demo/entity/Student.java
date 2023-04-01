package com.example.demo.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;
@Data
@Entity
@AllArgsConstructor
public class Student extends User{
    private String faculty;
    private String department;
    private boolean hasWithdrawn;
    private double erasmusGrade;
    private Date withdrawDeadline;
    private int applicationStatus;
    private String placedUniversity;
    private int preapprovalFormStatus;
    private Date preapprovalFormDeadline;
    private Feedback feedback;



    public Student() {
    }


}
