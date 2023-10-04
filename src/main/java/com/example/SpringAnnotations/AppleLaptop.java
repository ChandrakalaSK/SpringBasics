package com.example.SpringAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AppleLaptop {

@Autowired
@Qualifier("windows")
private LaptopProcessor operatingsystem;

    public LaptopProcessor getOperatingsystem() {
        return operatingsystem;
    }

    public void setOperatingsystem(LaptopProcessor operatingsystem) {
        this.operatingsystem = operatingsystem;
    }

    public void Configuration()
    {
        System.out.println("8gb memory,MacBook Air(4),Apple M1");
        operatingsystem.process();
    }


}
