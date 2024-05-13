package it.epicode.primoesempio;

import lombok.Data;

@Data
public class Drinks {
    private String nome;
    private int prezzo;
    private int calorie;



    public void SettaD(int i, int i1, String nome) {
        this.prezzo = i;
        this.calorie  = i1;
        this.nome = nome;
    }

}
