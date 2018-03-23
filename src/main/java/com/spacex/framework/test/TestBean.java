package com.spacex.framework.test;


import com.spacex.framework.annotation.Bean;

@Bean
public class TestBean {
    static {
        System.out.println("TestBean init...");
    }
}
