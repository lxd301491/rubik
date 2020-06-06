package com.example.rubik.controller;

import com.example.rubik.service.AuthService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {
    private static final Logger logger = LoggerFactory.getLogger(AuthController.class);

    @Autowired
    private AuthService authService;

    @RequestMapping("/login")
    public boolean GetPassword(String account, String password) {
        logger.info("GetPassword 开始");
        return authService.login(account, password);
    }
}
