package com.example.test1;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class GreetingController {
    @RequestMapping ("/greeting")
    public String getGreeting() {
        return "Thanks God, finally it is working.rrr......";

    }
}