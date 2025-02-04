package com.example.EsercizoBE_U2_W1_D1_Spring.model;

import lombok.*;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@AllArgsConstructor
@Data
@SuperBuilder
public class Pizza extends MenuElement{
    private String ingredients;

   /* public Pizza(String name, int calories, double price, String ingredients) {
        super(name, calories, price);
        this.ingredients = ingredients;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }*/
}
