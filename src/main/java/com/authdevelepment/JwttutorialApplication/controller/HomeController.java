package com.authdevelepment.JwttutorialApplication.controller;

import com.authdevelepment.JwttutorialApplication.service.JWTService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HomeController {

    private final JWTService jwtService;

    @PostMapping("/login")
    public String login(){
        return "User Login";
    }
}
