package com.example.testms;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Value("${test}")
    private String name;

    @GetMapping("/test")
    public String test(){
        return name;
    }
}
