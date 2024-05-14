package com.epicode.U5D1.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor

public class Ordine {


    List<Item> elementiMenu = new ArrayList<>();
    private int numeroOrdine;
    private StatoOrdine stato;
    private int numeroCoperti;
    private LocalDate dataAcquisizione;




}


