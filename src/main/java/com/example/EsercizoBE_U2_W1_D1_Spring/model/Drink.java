package com.example.EsercizoBE_U2_W1_D1_Spring.model;

import lombok.*;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@AllArgsConstructor
@Data
@SuperBuilder
public class Drink extends MenuElement {
    private String additionalInfo;

    /*public Drink(String name, int calories, double price, String additionalInfo) {
        super(name, calories, price);
        this.additionalInfo = additionalInfo;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }*/
}
