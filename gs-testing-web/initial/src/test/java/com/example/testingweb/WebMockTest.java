package com.example.testingweb;

//這都要我自己複製 why
import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.example.testingweb.Controller.GreetingController;
import com.example.testingweb.Service.GreetingService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

//   @WebMvcTest: This annotation is used to configure a Spring MVC test context.
//   @WebMvcTest 是一個 Spring MVC 測試上下文設定，它可以讓您測試 Spring MVC 的控制器。
//   @WebMvcTest(GreetingController.class) 指定測試的控制器類別。
@WebMvcTest(GreetingController.class)
public class WebMockTest {

//    MockMvc mockMvc: This field is used to perform HTTP requests and receive HTTP responses.
//    mockMvc 是一個用於執行 HTTP 請求和接收 HTTP 回應的欄位。
    @Autowired
    private MockMvc mockMvc;

//    @MockBean: This annotation is used to inject a mock object into the test context.
//    @MockBean 是一個用於測試上下文中注入測試模擬物件的標記。
//    @MockBean(GreetingService.class) 指定測試模擬物件類別。
    @MockBean
    private GreetingService greetingService;

//    @Test: This annotation is used to mark a test method.
//    @Test 是一個標記測試方法的標記。
//    when (greetingService.greet()).thenReturn("Hello, Mock"); 指定測試模擬物件的方法。
//    thenReturn 是 Mockito 的方法，它可以指定測試模擬物件的方法回傳的值。
//    perform 是一個用於執行 HTTP 請求和接收 HTTP 回應的方法。
//    get("/greeting") 是一個用於執行 GET 請求的方法。
//    andDo(print()) 是一個用於輸出 HTTP 回應的方法。
//    andExpect(status().isOk()) 是一個用於檢查 HTTP 回應的方法。
//    andExpect(content().string(containsString("Hello, Mock"))); 是一個用於檢查 HTTP 回應的方法。
    @Test
    public void greetingShouldMessageFromService() throws Exception {
        when(greetingService.greeting()).thenReturn("Hello Mock?");
        this.mockMvc.perform(
                get("/greeting"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("Hello Mock")));
    }

}
