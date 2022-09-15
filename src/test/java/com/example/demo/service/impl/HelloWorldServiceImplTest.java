package com.example.demo.service.impl;

import com.example.demo.service.HelloWorldService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;


class HelloWorldServiceImplTest {

    private HelloWorldService helloWorldService;

    @BeforeEach
    public void setup() {
        helloWorldService = new HelloWorldServiceImpl();
    }

    @Test
    public void hello() {

        String expectedResult = "Hello Bob!";

        String actualResult = helloWorldService.hello();

        assertThat(actualResult).isEqualTo(expectedResult);
    }
}