package com.example.testingweb.Controller;

import com.example.testingweb.Service.GreetingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// @RestController: This annotation is used to mark a class as a controller class.
// @RestController 跟 @Controller 的差別在於，@RestController 可以直接把資料回傳給前端，而 @Controller 只能把資料傳給 View。
// @RestController 是一個控制器類別，並且它的所有方法都會回傳 JSON 格式的資料。
@RestController
public class GreetingController {

    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    // @GetMapping: This annotation is used to map HTTP GET requests to specific handler methods.
    @GetMapping("/greeting")
    public String greeting() {
        return greetingService.greeting();
    }

}
