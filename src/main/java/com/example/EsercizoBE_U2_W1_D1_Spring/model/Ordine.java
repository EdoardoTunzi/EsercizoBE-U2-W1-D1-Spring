package com.example.EsercizoBE_U2_W1_D1_Spring.model;

import ch.qos.logback.core.encoder.JsonEscapeUtil;
import lombok.*;
import org.w3c.dom.ls.LSOutput;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Ordine {

    private int numeroOrdine;
    private StatoOrdine statoOrdine;
    private int numeroCoperti;
    private double costoCoperto;
    private LocalTime oraDiAcquisizione;
    private Tavolo tavolo;
    private List<MenuElement> listaElementiOrdinati = new ArrayList<>();
    /*private double importoTotale = getTotaleOrdine();*/

    public double getTotaleOrdine () {
        double sommaElementiOrdinati = listaElementiOrdinati.stream()
                .map(MenuElement::getPrice) // Estrai i prezzi degli elementi
                .reduce(0.0, Double::sum);
        double sommaCoperti = costoCoperto * numeroCoperti;
       return sommaCoperti+sommaElementiOrdinati;
    }
}
