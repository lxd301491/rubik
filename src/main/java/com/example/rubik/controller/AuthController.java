package com.example.rubik.controller;

import com.example.rubik.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private AuthService authService;

    @RequestMapping("/login")
    public boolean GetPassword(String account, String password) {
        return authService.login(account, password);
    }
}
