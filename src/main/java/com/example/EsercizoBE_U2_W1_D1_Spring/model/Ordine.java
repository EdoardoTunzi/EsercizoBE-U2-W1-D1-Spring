package com.example.EsercizoBE_U2_W1_D1_Spring.model;

import ch.qos.logback.core.encoder.JsonEscapeUtil;
import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.w3c.dom.ls.LSOutput;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;


@Data
@PropertySource("application.properties")
public class Ordine {

    private int numeroOrdine;
    private StatoOrdine statoOrdine;
    private int numeroCoperti;
    @Value("${costo.coperto}")
    private double costoCoperto;
    private LocalTime oraDiAcquisizione;
    private Tavolo tavolo;
    private List<MenuElement> listaElementiOrdinati;
    private static int count = 1;

    public Ordine(int numeroCoperti, Tavolo tavolo) {
        this.numeroOrdine = count++;
        this.statoOrdine = StatoOrdine.IN_CORSO;
        this.numeroCoperti = numeroCoperti;
        this.oraDiAcquisizione = LocalTime.now();
        this.listaElementiOrdinati = new ArrayList<>();
        this.tavolo = tavolo;
    }

    public double getTotaleOrdine () {
        double sommaElementiOrdinati = listaElementiOrdinati.stream()
                .map(MenuElement::getPrice) // Estrai i prezzi degli elementi
                .reduce(0.0, Double::sum);
        double sommaCoperti = costoCoperto * numeroCoperti;
       return sommaCoperti+sommaElementiOrdinati;
    }

    public void addMenuElement(MenuElement elemento) {
        this.listaElementiOrdinati.add(elemento);
    }

    public void printOrder () {
        System.out.println("id ordine--> " + this.numeroOrdine);
        System.out.println("stato--> " + this.statoOrdine);
        System.out.println("numero coperti--> " + this.numeroCoperti);
        System.out.println("ora acquisizione--> " + this.oraDiAcquisizione);
        System.out.println("numero tavolo--> " + this.tavolo.getNumeroTavolo());
        System.out.println("Lista elementi ordinati: ");
        this.listaElementiOrdinati.forEach(System.out::println);
        System.out.println("totale--> " + this.getTotaleOrdine());
    }
}
