package com.example.SpringAnnotations;

import org.springframework.stereotype.Component;

@Component
public class Windows implements LaptopProcessor{
    @Override
    public void process() {
        System.out.println("World best operating system");
    }
}
