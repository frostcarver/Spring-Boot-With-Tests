package com.example.demo.service.impl;

import com.example.demo.service.HelloWorldService;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldServiceImpl implements HelloWorldService {
    @Override
    public String hello() {
        return "Hello Bob!";
    }
}
