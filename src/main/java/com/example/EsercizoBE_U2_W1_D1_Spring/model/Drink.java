package com.example.EsercizoBE_U2_W1_D1_Spring.model;

import lombok.*;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@Data

public class Drink extends MenuElement {


    public Drink(String name, int calories, double price) {
        super(name, calories, price);
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + getName() + '\'' +
                ", calories=" + getCalories() +
                ", price=" + getPrice() +
                '}';
    }
}
