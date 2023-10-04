package com.example.SpringAnnotations;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Linux implements LaptopProcessor{
    @Override
    public void process() {
        System.out.println("3rd best operating system");
    }
}
