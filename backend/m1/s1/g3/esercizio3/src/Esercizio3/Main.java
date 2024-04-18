package Esercizio3;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {



    public static void main(String[] args) {
        Rettangolo primo = new Rettangolo();
        primo.setAltezza(5);
        primo.setLarghezza(4);
        Rettangolo secondo = new Rettangolo();
        secondo.setLarghezza(6);
        secondo.setAltezza(7);
        System.out.println(primo.area());
        System.out.println(primo.perimetro());
        stampa(primo);
        stampa2(primo, secondo);


    }
    public static void stampa(Rettangolo primo){
        System.out.println("perimetro: " + primo.perimetro() + " " + "area: " + primo.area());
    }

    public static void stampa2(Rettangolo primo, Rettangolo secondo){
        System.out.println("primo rettangolo:" + "perimetro: " + " " + primo.perimetro() + " " + "area: " + primo.area());
        System.out.println("secondo rettangolo:" + "perimetro: " + " " + secondo.perimetro() + " " + "area: " + secondo.area());
    }




}