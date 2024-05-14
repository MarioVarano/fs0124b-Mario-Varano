package com.epicode.U5D1.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor

public class Tavolo {
    private int numeroTavolo;
    private int numeroCoperti;
    private boolean stato;
    private Ordine ordine;
}
