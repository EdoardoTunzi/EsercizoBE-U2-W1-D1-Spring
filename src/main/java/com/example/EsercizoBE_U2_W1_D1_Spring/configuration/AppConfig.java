package com.example.EsercizoBE_U2_W1_D1_Spring.configuration;

import com.example.EsercizoBE_U2_W1_D1_Spring.model.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.time.LocalTime;

@Configuration
public class AppConfig {

    @Bean("CustomDrink")
    @Scope("prototype")
    public Drink drinkElement() {
        return new Drink();
    }

    @Bean("CustomPizza")
    @Scope("prototype")
    public Pizza pizzaElement() {
        return new Pizza();
    }

    @Bean("CustomTopping")
    @Scope("prototype")
    public Topping toppingElement() {
        return new Topping();
    }

    @Bean("CustomTavolo")
    @Scope("prototype")
    public Tavolo tavoloBean(){
        return new Tavolo();
    }


    @Bean("CustomOrdine")
    @Scope("prototype")
    public Ordine ordineBean() {
        return new Ordine();
    }
}
