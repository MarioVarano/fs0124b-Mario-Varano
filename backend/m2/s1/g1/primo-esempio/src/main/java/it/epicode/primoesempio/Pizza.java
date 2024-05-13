package it.epicode.primoesempio;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
public class Pizza {
    private String nome;
    private String base = "pomodoro";
    private String base2 = "mozzarella";
    private int prezzo;
    private int calorie;
    List<String> ingredienti = new ArrayList<>();




    public void Setta(int i, int i1, String nome) {
        this.prezzo = i;
        this.calorie  = i1;
        this.nome = nome;
    }


    public void PizzaSpeciale(Toppings t,String nome){
        this.nome = nome;
        this.ingredienti.add(t.getIngrediente1());
        this.prezzo += t.getPrezzo();
        this.calorie += t.getCalorie();


    }
}


