package com.Aakash.demoSpringSecurity.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/hello")
    public String printhello(HttpServletRequest request){
        return "hello world" + request.getSession().getId();
    }
}
