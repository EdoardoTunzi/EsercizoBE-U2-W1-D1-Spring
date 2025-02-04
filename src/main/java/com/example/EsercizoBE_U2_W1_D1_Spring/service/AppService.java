package com.example.EsercizoBE_U2_W1_D1_Spring.service;

import com.example.EsercizoBE_U2_W1_D1_Spring.model.*;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class AppService {
    @Autowired @Qualifier("CustomTavolo") ObjectProvider<Tavolo> tavoloObjectProvider;
    @Autowired @Qualifier("CustomOrdine") ObjectProvider<Ordine> ordineObjectProvider;
    @Autowired @Qualifier("CustomPizza") ObjectProvider<Pizza> pizzaObjectProvider;
    @Autowired @Qualifier("CustomDrink") ObjectProvider<Drink> drinkObjectProvider;
    @Autowired @Qualifier("CustomTopping") ObjectProvider<Topping> toppingObjectProvider;

    public Tavolo createTavolo() {
        return tavoloObjectProvider.getObject();
    }
    public Ordine createOrdine() {
        return ordineObjectProvider.getObject();
    }

    public Pizza createpizza() {
        return pizzaObjectProvider.getObject();
    }

    public Drink createDrink() {
        return drinkObjectProvider.getObject();
    }

    public Topping createTopping() {
        return toppingObjectProvider.getObject();
    }

}
