package com.example.EsercizoBE_U2_W1_D1_Spring.model;

import lombok.*;
import lombok.experimental.SuperBuilder;


/*@NoArgsConstructor(force = true)*/

@Data
public class Topping extends MenuElement {

    public Topping(String name, int calories, double price) {
        super(name, calories, price);
    }

    @Override
    public String toString() {
        return "Topping{ " + super.toString() + "}";
    }
}
