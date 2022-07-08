package com.example.testingweb.Service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public String greeting() {
        return "Hello Mock!";
    }
}
