package com.example.EsercizoBE_U2_W1_D1_Spring.model;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;


@Data
public class Pizza extends MenuElement{

    private List<Topping> toppingList;
    private boolean isXl = false;

    public Pizza(String name, int calories, double price, List<Topping> toppingList, boolean isXl) {
        super(name, calories, price);
        this.toppingList = toppingList;
        this.isXl = isXl;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "toppingList=" + toppingList +
                ", isXl=" + isXl +
                "} " + super.toString();
    }
}
