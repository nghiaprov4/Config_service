package com.example.config_service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sevice")
public class controller {
    @Value("${welcome}")
    private String welcome;
    @PostMapping("/")
    public String HelloWord(){

        return welcome;
    }
}
