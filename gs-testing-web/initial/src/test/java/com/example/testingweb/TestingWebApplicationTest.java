package com.example.testingweb;//這裡的幾個都是我貼過來的 沒辦法import 為什麼呢?
import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.test.autoconfigure.properties.PropertyMapping;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.lang.annotation.*;

@SpringBootTest
// @AutoConfigureMockMvc: This annotation is used to enable the MockMvc feature.
// 使用@AutoConfigureMockMvc，就可以使用MockMvc特性。
// MockMvc特性是模擬Web Server的功能，可以模擬Web Server的請求與回應。這樣就可以把HTTP request與HTTP response模擬成Web Server的請求與回應。
// 而不需要啟動server，全部交給psring來handle。
// @AutoConfigureMockMvc包含了@SpringBootTest的功能，但是沒有@SpringBootTest的功能。
@AutoConfigureMockMvc
public class TestingWebApplicationTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldReturnDefaultMessage() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders.get("/")).andExpect(MockMvcResultMatchers.status().isOk()).andExpect(MockMvcResultMatchers.content().string(Matchers.containsString("Hello World")));
    }

}
