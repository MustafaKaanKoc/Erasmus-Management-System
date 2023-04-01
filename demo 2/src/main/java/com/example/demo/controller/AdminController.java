package com.example.demo.controller;
import com.example.demo.entity.Admin;
import com.example.demo.usecases.AddAdminUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AdminController {

    @Autowired
    private AddAdminUseCase addAdminUseCase;

    @PostMapping("/addAdmin")
    void postAdmin(@RequestBody Admin admin){
        addAdminUseCase.addAdmin(admin);
    }
}
