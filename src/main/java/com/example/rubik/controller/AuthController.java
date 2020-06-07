package com.example.rubik.controller;

import com.example.rubik.bean.RespResult;
import com.example.rubik.helper.RedisHelper;
import com.example.rubik.helper.RespResultHelper;
import com.example.rubik.service.AuthService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/auth")
public class AuthController {
    private static final Logger logger = LoggerFactory.getLogger(AuthController.class);

    @Autowired
    private AuthService authService;

    @Resource
    private RedisHelper redisHelper;

    @RequestMapping("/login")
    @ResponseBody
    public RespResult getPassword(String account, String password) {
        logger.info("getPassword 开始");

        if (authService.login(account, password)) {
            redisHelper.lRightPush("LOGINED_USERS", account);
            return RespResultHelper.success(true);
        }

        return RespResultHelper.failed();
    }
}
