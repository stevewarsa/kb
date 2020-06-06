package com.stevewarsa.knowledgebase.controller;

import com.stevewarsa.knowledgebase.model.GreetingsResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/greetings")
    public GreetingsResponse greetings() {
        return new GreetingsResponse(
                "Greetings from Spring Boot!",
                "I hope you're having a fantastic day!");
    }
}