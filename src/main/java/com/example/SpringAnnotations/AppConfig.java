package com.example.SpringAnnotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example.SpringAnnotations")
public class AppConfig {
  /*  @Bean
    public AppleLaptop getLaptop()
    {
        return new AppleLaptop();
    }
    @Bean
    public LaptopProcessor getOperatingSystem()
    {
        return new Windows();
    }*/
}
