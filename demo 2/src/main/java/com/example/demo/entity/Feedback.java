package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;
@Data
@Entity
@AllArgsConstructor
public class Feedback {
    @OneToOne
    private Personnel sender;
    private String text;
    private Date sendDate;
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long feedbackId;
    private Long studentId;

    public Feedback() {

    }


}
