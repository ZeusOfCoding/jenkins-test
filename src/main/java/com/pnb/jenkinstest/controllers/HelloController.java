package com.pnb.jenkinstest.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String greetings(){
        return "Hello from jenkins test app 😍😍😍. Here time is " + new Date().toString();
    }

}
