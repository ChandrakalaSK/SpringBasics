package com.example.springAnnontationBasics;

import org.springframework.stereotype.Component;

@Component
public class Snapdragon implements MobileProcessor{
    @Override
    public void process() {
        System.out.println("Best Cpu");
    }
}
