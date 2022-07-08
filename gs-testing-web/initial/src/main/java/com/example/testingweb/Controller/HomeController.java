package com.example.testingweb.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

//    this example does not sprcify get versus put, post, delete, etc.
//    By default, it is a get request.
//    Or, you can use @RequestMapping(method = RequestMethod.GET)
    @RequestMapping("/")
    public String greeting() {
        return "Hello World!";
    }

}
