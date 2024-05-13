package it.epicode.primoesempio;

import lombok.Data;

@Data
public class Toppings {
    private String ingrediente1;
    private int prezzo;
    private  int calorie;




    public void SettaT(int i, int i1, String ingrediente ) {
        this.prezzo = i;
        this.calorie  = i1;
        this.ingrediente1 = ingrediente;
    }
}
