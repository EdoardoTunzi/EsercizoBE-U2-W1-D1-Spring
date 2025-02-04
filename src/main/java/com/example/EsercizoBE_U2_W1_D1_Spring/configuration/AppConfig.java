package com.example.EsercizoBE_U2_W1_D1_Spring.configuration;

import com.example.EsercizoBE_U2_W1_D1_Spring.model.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {

    //toppings
    @Bean(name = "toppings_tomato")
    public Topping toppingTomatoBean() {
        return new Topping("Tomato", 0, 0);
    }

    @Bean(name = "toppings_cheese")
    public Topping toppingCheeseBean() {
        return new Topping("Cheese", 92, 0.69);
    }

    @Bean(name = "toppings_ham")
    public Topping toppingHamBean() {
        return new Topping("Ham", 35, 0.99);
    }

    @Bean(name = "toppings_pineapple")
    public Topping toppingPineappleBean() {
        return new Topping("Pineapple", 24, 0.79);
    }

    @Bean(name = "toppings_salami")
    public Topping toppingSalamiBean() {
        return new Topping("Salami", 86, 0.99);
    }
    //pizze
    @Bean(name = "pizza_margherita")
    public Pizza pizzaMargheritaBean() {
        List<Topping> tList = new ArrayList<>();
        tList.add(toppingTomatoBean());
        tList.add(toppingCheeseBean());
        return new Pizza("Pizza Margherita",1104,4.99 ,tList, false);
    }

    @Bean(name = "hawaiian_pizza")
    public Pizza pizzaHawaiianBean() {
        List<Topping> tList = new ArrayList<>();
        tList.add(toppingTomatoBean());
        tList.add(toppingCheeseBean());
        tList.add(toppingHamBean());
        tList.add(toppingPineappleBean());
        return new Pizza("Hawaiian Pizza",1024,6.49, tList, false);
    }

    @Bean(name = "salami_pizza")
    public Pizza pizzaSalamiBean() {
        List<Topping> tList = new ArrayList<>();
        tList.add(toppingTomatoBean());
        tList.add(toppingCheeseBean());
        tList.add(toppingSalamiBean());
        return new Pizza("Salami Pizza",1160,5.99, tList, false);
    }

    @Bean(name = "salami_pizza_xl")
    public Pizza pizzaSalamiXlBean() {
        List<Topping> tList = new ArrayList<>();
        tList.add(toppingTomatoBean());
        tList.add(toppingCheeseBean());
        tList.add(toppingSalamiBean());
        return new Pizza("Salami Pizza XL",1450,10.99, tList, true);
    }
//drinks
    @Bean(name = "lemonade")
    public Drink lemonadeBean() {
        return new Drink("Lemonade", 128, 1.29);
    }

    @Bean(name = "water")
    public Drink waterBean() {
        return new Drink("Water", 0, 1.29);
    }

    @Bean(name = "wine")
    public Drink wineBean() {
        return new Drink("Wine", 607, 7.49);
    }

    @Bean("pizzas")
    List<Pizza> pizzaList() {
        List<Pizza> pizzas = new ArrayList<>();
        pizzas.add(pizzaMargheritaBean());
        pizzas.add(pizzaHawaiianBean());
        pizzas.add(pizzaSalamiBean());
        pizzas.add(pizzaSalamiXlBean());
        return pizzas;
    }

    @Bean("drinks")
    List<Drink> drinksList() {
        List<Drink> drinks = new ArrayList<>();
        drinks.add(lemonadeBean());
        drinks.add(waterBean());
        drinks.add(wineBean());
        return drinks;
    }

    @Bean("toppings")
    List<Topping> toppingsList() {
        List<Topping> toppings = new ArrayList<>();
        toppings.add(toppingTomatoBean());
        toppings.add(toppingCheeseBean());
        toppings.add(toppingSalamiBean());
        toppings.add(toppingHamBean());
        toppings.add(toppingPineappleBean());
        return toppings;
    }

    @Bean("menu")
     Menu menuBean(@Qualifier("pizzas") List<Pizza> pizzas,
                   @Qualifier("drinks") List<Drink> drinks,
                   @Qualifier("toppings") List<Topping> toppings) {
        return new Menu(pizzas, drinks, toppings);
    }


//tavoli

    @Bean("Tavolo1")
    Tavolo getTable1() {
        return new Tavolo(1, 5, true);
    }

    @Bean("Tavolo2")
    Tavolo getTable2() {
        return new Tavolo(2, 4, true);
    }

    @Bean("Tavolo3")
    Tavolo getTable3() {
        return new Tavolo(3, 8, true);
    }

   /* @Bean("CustomTavolo")
    @Scope("prototype")
    public Tavolo tavoloBean() {
        return new Tavolo();
    }


    @Bean("CustomOrdine")
    @Scope("prototype")
    public Ordine ordineBean() {
        return new Ordine();
    }*/
}
