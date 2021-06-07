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

        int a1=10;
        int a2=20;
        int a3=23;
        String strs="hello";
        String s=strs+a3;

        System.out.println(s);
        System.out.println(a1+a2);
    }

}
