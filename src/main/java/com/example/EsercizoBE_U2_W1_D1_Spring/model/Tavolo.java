package com.example.EsercizoBE_U2_W1_D1_Spring.model;

import lombok.*;


@AllArgsConstructor
@Getter
public class Tavolo {
    private int numeroTavolo;
    private int numeroCoperti;
    private boolean disponibile;

    public void printTavoloInfo() {
        System.out.println("numero tavolo--> " + numeroTavolo);
        System.out.println("numero massimo coperti--> " + numeroCoperti);
        System.out.println("occupato/libero--> " + (this.disponibile ? "Libero" : "Occupato"));
    }
}


