package com.example.rubik.service.impl;

import com.example.rubik.mapper.AuthMapper;
import com.example.rubik.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    @Autowired
    private AuthMapper authMapper;

    @Override
    public boolean login(String account, String password) {
        return password.equals(authMapper.selectPassword(account));
    }
}
