package com.example.SpringIOCbasic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring1.xml");
        SonyXperia sonyXperia= (SonyXperia) context.getBean("sonyXperia");
        sonyXperia.features();

        /*SimCard simCard= (SimCard) context.getBean("simcard");
        System.out.println(simCard);*/
    }
}
