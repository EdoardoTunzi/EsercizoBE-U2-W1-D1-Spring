package com.example.EsercizoBE_U2_W1_D1_Spring.runner;

import com.example.EsercizoBE_U2_W1_D1_Spring.model.*;
import com.example.EsercizoBE_U2_W1_D1_Spring.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Component
public class AppRunner implements CommandLineRunner {
    @Autowired
    private AppService appService;
    @Value("${costo.coperto}")
    private double costoCoperto;

    @Override
    public void run(String... args) throws Exception {
        Pizza p1 = appService.createpizza().builder().name("Pizza Margherita").ingredients("(tomato,cheese)").calories(1104).price(4.99).build();
        Drink d1 = appService.createDrink().builder().name("Lemonade").calories(128).price(1.29).additionalInfo("(0,33l)").build();




        List<MenuElement> listaOrdine = new ArrayList<>();
        listaOrdine.add(p1);
        listaOrdine.add(d1);


        Tavolo t1 = appService.createTavolo().builder().numeroTavolo(1).numeroCoperti(4).disponibile(true).build();
        Ordine o1 = appService.createOrdine().builder().numeroOrdine(1).statoOrdine(StatoOrdine.IN_CORSO).numeroCoperti(4).costoCoperto(costoCoperto).oraDiAcquisizione(LocalTime.now()).tavolo(t1).listaElementiOrdinati(listaOrdine).build();

        System.out.println(o1);
        System.out.println(" Il totale è " + o1.getTotaleOrdine());
    }
}
