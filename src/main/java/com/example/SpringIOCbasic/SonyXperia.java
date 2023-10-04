package com.example.SpringIOCbasic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SonyXperia implements MobileDevices{
@Autowired
    private SimCard simCard;

    public SimCard getSimCard() {
        return simCard;
    }

    public void setSimCard(SimCard simCard) {
        this.simCard = simCard;
    }

    public void features()
    {
        System.out.println("Sony:"+simCard);
    }
}
