package com.example.EsercizoBE_U2_W1_D1_Spring.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Tavolo {
    private int numeroTavolo;
    private int numeroCoperti;
    private boolean disponibile;
}
