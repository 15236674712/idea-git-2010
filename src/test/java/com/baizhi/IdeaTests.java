package com.baizhi;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class IdeaTests {

    @Test
    void contextLoads() {
        System.out.println("---------");
    }

    public static void main(String[] args) {
        int a=10;
        System.out.println("----");
        String str="aaa";
        int aaa=13;
        System.out.println(aaa);

        String strs="hello";

        int a3=23;

        String s=strs+a3;
        System.out.println(s);
    }

}
