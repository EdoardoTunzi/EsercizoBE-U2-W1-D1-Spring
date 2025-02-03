package com.example.EsercizoBE_U2_W1_D1_Spring.entities;

import lombok.*;

@NoArgsConstructor
@ToString
public class Drink extends MenuElement {
    private String additionalInfo;

    public Drink(String name, int calories, double price, String additionalInfo) {
        super(name, calories, price);
        this.additionalInfo = additionalInfo;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }
}
