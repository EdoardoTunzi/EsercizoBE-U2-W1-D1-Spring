package com.example.EsercizoBE_U2_W1_D1_Spring.entities;

import lombok.*;

@NoArgsConstructor

@Getter
@Setter
@ToString
public class Topping extends MenuElement {

    public Topping(String name, int calories, double price) {
        super(name, calories, price);
    }
}
