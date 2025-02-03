package com.example.EsercizoBE_U2_W1_D1_Spring.entities;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ElementBean {

    @Bean
    @Scope("prototype")
    public Drink drinkElement(String name, int calories, double price, String additionalInfo) {
        return new Drink(name, calories, price, additionalInfo);
    }

    @Bean
    @Scope("prototype")
    public Pizza pizzaElement(String name, int calories, double price, String ingredients) {
        return new Pizza(name, calories, price, ingredients);
    }

    @Bean
    @Scope("prototype")
    public Topping toppingElement(String name, int calories, double price) {
        return new Topping(name, calories, price);
    }
}
