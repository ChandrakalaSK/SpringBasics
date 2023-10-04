package com.example.SpringIOCbasic;

import org.springframework.stereotype.Component;

@Component
public class SimCard {
    private String company;

   /* public SimCard(String company) {
        this.company = company;
    }*/

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "its working";
    }
}
