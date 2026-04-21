package com.authdevelepment.JwttutorialApplication.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @PostMapping("/login")
    public String login(){
        return "User Login";
    }
}
