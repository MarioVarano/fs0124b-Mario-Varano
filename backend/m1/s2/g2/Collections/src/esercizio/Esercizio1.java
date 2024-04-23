package esercizio;

import java.util.*;

public class Esercizio1 {
    Set<String> lista = new HashSet<>();
    Set<String> duplicati = new HashSet<>();

    public Esercizio1() {
        System.out.println("Inserisci un intero: ");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        scanner.nextLine();


        int parole = 0;
        do{
            System.out.println("Inserisci parola: ");
            String parola = scanner.nextLine();
            scanner.nextLine();
            if(!lista.add(parola)){
                duplicati.add(parola);
            }
            lista.add(parola);
            parole ++;
        }while (parole < numero);

        for(String el: lista){
            System.out.print(el + " ");
        }
        System.out.println("Numero elementi: " + lista.size());
        for(String el: duplicati){
            System.out.println("Duplicati: " + el);
        }


    }
}
