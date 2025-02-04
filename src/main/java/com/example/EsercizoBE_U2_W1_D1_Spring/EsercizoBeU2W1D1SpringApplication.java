package com.example.EsercizoBE_U2_W1_D1_Spring;

import com.example.EsercizoBE_U2_W1_D1_Spring.model.Drink;
import com.example.EsercizoBE_U2_W1_D1_Spring.configuration.AppConfig;
import com.example.EsercizoBE_U2_W1_D1_Spring.model.Pizza;
import com.example.EsercizoBE_U2_W1_D1_Spring.model.Topping;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class EsercizoBeU2W1D1SpringApplication {

	public static void main(String[] args) {

		SpringApplication.run(EsercizoBeU2W1D1SpringApplication.class, args);
		/*menuConfig();*/
	}

	public static void menuConfig(){
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

		Pizza p1 = (Pizza) appContext.getBean("pizzaElement", "Pizza Margherita",1104,4.99,"(tomato,cheese)");
		Pizza p2 = (Pizza) appContext.getBean("pizzaElement", "Hawaiian Pizza",1024,6.49,"(tomato, cheese, ham, pineapple)");
		Pizza p3 = (Pizza) appContext.getBean("pizzaElement", "Salami Pizza",1160,5.99,"(tomato, cheese, salami)");
		System.out.println("-----Pizzas, Calories,  Price-----");
		System.out.println(p1.getName() + " " + p1.getIngredients() + " " + p1.getCalories() +"   " + p1.getPrice());
		System.out.println(p2.getName() + " " + p2.getIngredients() + " " + p2.getCalories() +"   " + p2.getPrice());
		System.out.println(p3.getName() + " " + p3.getIngredients() + " " + p3.getCalories() +"   " + p3.getPrice());

		Topping t1 = (Topping) appContext.getBean("toppingElement", "Cheese", 92, 0.69);
		Topping t2 = (Topping) appContext.getBean("toppingElement", "Ham", 35, 0.99);
		Topping t3 = (Topping) appContext.getBean("toppingElement", "Onions", 22, 0.69);
		Topping t4 = (Topping) appContext.getBean("toppingElement", "Pineapple", 24, 0.79);
		Topping t5 = (Topping) appContext.getBean("toppingElement", "Salami", 86, 0.99);
		System.out.println("-----Toppings, Calories, Price-----");
		System.out.println(t1.getName() + " "+ t1.getCalories() +" "+ t1.getPrice());
		System.out.println(t2.getName() + " "+ t2.getCalories() +" "+ t2.getPrice());
		System.out.println(t3.getName() + " "+ t3.getCalories() +" "+ t3.getPrice());
		System.out.println(t4.getName() + " "+ t4.getCalories() +" "+ t4.getPrice());
		System.out.println(t5.getName() + " "+ t5.getCalories() +" "+ t5.getPrice());

		Drink d1 = (Drink) appContext.getBean("drinkElement", "Lemonade", 128, 1.29, "(0,33l)");
		Drink d2 = (Drink) appContext.getBean("drinkElement", "Water", 0, 1.29, "(0,5l)");
		Drink d3 = (Drink) appContext.getBean("drinkElement", "Wine", 607, 7.49, "(0,75l, 13%)");
		System.out.println("------Drink, Calories, Price:------");
		System.out.println(d1.getName() +" "+ d1.getAdditionalInfo() +" "+ d1.getCalories() +" "+ d1.getPrice());
		System.out.println(d2.getName() +" "+ d2.getAdditionalInfo() +" "+ d2.getCalories() +" "+ d2.getPrice());
		System.out.println(d3.getName() +" "+ d3.getAdditionalInfo() +" "+ d3.getCalories() +" "+ d3.getPrice());
	}

}

