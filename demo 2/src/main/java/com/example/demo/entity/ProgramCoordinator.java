package com.example.demo.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity
@AllArgsConstructor
public class ProgramCoordinator extends Personnel{
    private String faculty;

    public ProgramCoordinator() {

    }
}
