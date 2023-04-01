package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
@Data
@Entity
@AllArgsConstructor
public class PreapprovalForm {
    @OneToOne
    private Student sender;
    private String form;
    private Date sendDate;
    @OneToMany
    private ArrayList<Feedback> feedbacks;
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long formId;

    public PreapprovalForm() {

    }


}
