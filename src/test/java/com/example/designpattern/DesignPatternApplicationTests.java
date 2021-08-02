package com.example.designpattern;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DesignPatternApplicationTests {

    @Test
    void contextLoads() {
        String aa = "21232";
        aa = aa ==null? "123": aa;
        System.out.println(aa);
    }

}
