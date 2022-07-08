package com.example.testingweb;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import static org.assertj.core.api.Assertions.assertThat;

// webEnvironment 是指測試時使用的環境，可以是：
// SpringBootTest.WebEnvironment.DEFINED_PORT: 測試時使用一個指定的 port，並且測試時會建立一個 server。
// SpringBootTest.WebEnvironment.MOCK: 測試時使用一個模擬的 server，並且測試時不會建立一個 server。
// SpringBootTest.WebEnvironment.NONE: 測試時不使用 server。
// SpringBootTest.WebEnvironment.RANDOM_PORT: 測試時使用一個隨機的 port，並且測試時會建立一個 server。
// 使用RANDOM_PORT時，必須要在測試時使用@LocalServerPort來指定 port。且使用RANDOM_PORT就不會和可能正在run的port重疊而產生衝突。
// SpringBootTest.WebEnvironment.DEFINED_PORT: 測試時使用一個指定的 port，並且測試時會建立一個 server。

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HttpRequestTest {

//  @LocalServerPort 是一個 annotation，用來指定測試時使用的 port。
    @LocalServerPort
    private int port;

//  TestRestTemplate 是一個 Spring Boot 的測試工具，用來測試 HTTP 請求。
    @Autowired
    private TestRestTemplate restTemplate;

//  assertThat 是一個 JUnit 5 的 assertion library，用來測試某個物件是否符合某個條件。
//  getForObject 是一個 Spring Boot 的測試工具，用來測試 HTTP 請求。

    @Test
    public void greetingShouldReturnDefaultMessage() throws Exception {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/", String.class)).contains("Hello World!");
    }

}
