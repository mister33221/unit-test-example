package com.example.testingweb;
// assertThat is a JUnit 5 assertion library.


import com.example.testingweb.Controller.HomeController;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SmokeTest {

    @Autowired
    private HomeController homeController;

//  為什麼這邊一定要@Autowired?
//  因為HomeController是一個Controller，所以要透過Autowired來設定HomeController(?
    @Autowired
    public SmokeTest(HomeController homeController) {
        this.homeController = homeController;
    }


    @Test
    public void contextLoads() throws Exception {
        Assertions.assertThat(homeController).isNotNull();
    }
}
