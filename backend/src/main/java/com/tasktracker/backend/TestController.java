package com.tasktracker.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/ping")
    public String ping() {
        return "A Spring Boot szerver és a VSCode környezet tökéletesen működik!";
    }
}