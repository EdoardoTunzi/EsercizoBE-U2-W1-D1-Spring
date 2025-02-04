package com.example.EsercizoBE_U2_W1_D1_Spring.service;

import com.example.EsercizoBE_U2_W1_D1_Spring.model.*;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class AppService {
    @Autowired @Qualifier("Tavolo1") private ObjectProvider<Tavolo> tavolo1Provider;

    @Autowired @Qualifier("Tavolo2") private ObjectProvider<Tavolo> tavolo2Provider;

    @Autowired @Qualifier("Tavolo3") private ObjectProvider<Tavolo> tavolo3Provider;

    @Autowired @Qualifier("pizza_margherita") private ObjectProvider<Pizza> margheritaPizzaProvider;

    @Autowired @Qualifier("hawaiian_pizza") private ObjectProvider<Pizza> hawaiianPizzaProvider;

    @Autowired @Qualifier("salami_pizza") private ObjectProvider<Pizza> salamiPizzaProvider;

    @Autowired @Qualifier("salami_pizza_xl") private ObjectProvider<Pizza> salamiPizzaXlProvider;

    @Autowired @Qualifier("lemonade") private ObjectProvider<Drink> lemonadeProvider;

    @Autowired @Qualifier("water") private ObjectProvider<Drink> waterProvider;

    @Autowired @Qualifier("wine") private ObjectProvider<Drink> wineProvider;

    @Autowired @Qualifier("toppings_tomato") private ObjectProvider<Topping> tomatoToppingProvider;

    @Autowired @Qualifier("toppings_cheese") private ObjectProvider<Topping> cheeseToppingProvider;

    @Autowired @Qualifier("toppings_ham") private ObjectProvider<Topping> hamToppingProvider;

    @Autowired @Qualifier("toppings_pineapple") private ObjectProvider<Topping> pineappleToppingProvider;

    @Autowired @Qualifier("toppings_salami") private ObjectProvider<Topping> salamiToppingProvider;

    @Autowired @Qualifier("menu") ObjectProvider<Menu> menuObjectProvider;

    public Menu createMenu() {
        return menuObjectProvider.getObject();
    }

    public Tavolo createTavolo1() {
        return tavolo1Provider.getObject();
    }

    public Tavolo createTavolo2() {
        return tavolo2Provider.getObject();
    }

    public Tavolo createTavolo3() {
        return tavolo3Provider.getObject();
    }

    public Pizza createMargheritaPizza() {
        return margheritaPizzaProvider.getObject();
    }

    public Pizza createHawaiianPizza() {
        return hawaiianPizzaProvider.getObject();
    }

    public Pizza createSalamiPizza() {
        return salamiPizzaProvider.getObject();
    }

    public Pizza createSalamiPizzaXL() {
        return salamiPizzaXlProvider.getObject();
    }

    public Drink createLemonade() {
        return lemonadeProvider.getObject();
    }

    public Drink createWater() {
        return waterProvider.getObject();
    }

    public Drink createWine() {
        return wineProvider.getObject();
    }

    public Topping createTomatoTopping() {
        return tomatoToppingProvider.getObject();
    }

    public Topping createCheeseTopping() {
        return cheeseToppingProvider.getObject();
    }

    public Topping createHamTopping() {
        return hamToppingProvider.getObject();
    }

    public Topping createPineappleTopping() {
        return pineappleToppingProvider.getObject();
    }

    public Topping createSalamiTopping() {
        return salamiToppingProvider.getObject();
    }
}
