package com.example.testingweb;
//這裡的幾個都是我貼過來的 沒辦法import 為什麼呢?
import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

// The test assertion is the same as in the previous case. However, in this test,
// Spring Boot instantiates only the web layer rather than the whole context.

// @WebMvcTest: This annotation is used to enable the MockMvc feature.
// 使用@WebMvcTest，就可以使用MockMvc特性。
@WebMvcTest
public class WebLayerTest {

    @Autowired
    private MockMvc mockMvc;


//    perform: This method is used to send a request to the MockMvc.
//    要求MockMvc對某個URL進行請求。
//    get: This method is used to send a GET request to the MockMvc.
//    要求MockMvc對某個URL進行GET請求。
//    post: This method is used to send a POST request to the MockMvc.
//    要求MockMvc對某個URL進行POST請求。
//    put: This method is used to send a PUT request to the MockMvc.
//    要求MockMvc對某個URL進行PUT請求。
//    delete: This method is used to send a DELETE request to the MockMvc.
//    要求MockMvc對某個URL進行DELETE請求。
//    andExpect: This method is used to verify the response from the MockMvc.
//    要求MockMvc檢查某個URL的回應。
//    status: This method is used to verify the status code of the response from the MockMvc.
//    要求MockMvc檢查某個URL的回應的狀態碼。
//    content: This method is used to verify the content of the response from the MockMvc.
//    要求MockMvc檢查某個URL的回應的內容。
//    string: This method is used to verify the content of the response from the MockMvc.
//    要求MockMvc檢查某個URL的回應的內容。
//    containsString: This method is used to verify the content of the response from the MockMvc.
//    要求MockMvc檢查某個URL的回應的內容。
//    andDo: This method is used to print the response from the MockMvc.
//    要求MockMvc印出某個URL的回應。
//    print: This method is used to print the response from the MockMvc.
//    要求MockMvc印出某個URL的回應。
//    andReturn: This method is used to get the response from the MockMvc.
//    要求MockMvc取得某個URL的回應。
//    andExpect: This method is used to verify the response from the MockMvc.
//    要求MockMvc檢查某個URL的回應。
//    status: This method is used to verify the status code of the response from the MockMvc.
//    要求MockMvc檢查某個URL的回應的狀態碼。



    @Test
    public void shouldReturnDefaultMessage() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders.get("/")).andDo(MockMvcResultHandlers.print()).andExpect(MockMvcResultMatchers.status().isOk()).andExpect(MockMvcResultMatchers.content().string(Matchers.containsString("Hello World")));
    }

}
