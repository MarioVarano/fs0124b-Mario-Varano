package java2;


import java.util.Scanner;

public class Main {

    public static boolean PariDispari(String parola){
        if(parola.length() % 2 == 0){
            return true;
        } else{
            return false;
        }
    }

    public static boolean annoBisestile(int anno){
        if(anno % 4 == 0){
           return true;
        } else if (anno % 100 == 0 && anno % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }


    public static String esercizio3(int numero){
        return switch (numero) {
            case 1 -> "uno";
            case 2 -> "due";
            case 3 -> "tre";
            default -> "Sbagliato";
        };
    }

    public static void esercizio4(){
        System.out.print("Inserisci stringa" + ": ");
        String a = new Scanner(System.in).nextLine();
        String[] risultato = a.split("");
        int i = 0;

        if(!a.equals(":q")){
            while (i < risultato.length){
                System.out.println(risultato[i] + ",");
                i++;

            }
        }



    }

    public static void esercizio5() {
        System.out.print("Inserisci numero" + ": ");
        int num = new Scanner(System.in).nextInt();
        for (int i = num; i >= 0; i--) {
            System.out.println(i);


        }


    }




    public static void main(String[] args) {
        boolean risultato =  PariDispari("albero");
        boolean risultato2 = annoBisestile(1230);
        String risultato3 = esercizio3(4);
        esercizio4();
        esercizio5();
        System.out.println(risultato);
        System.out.println(risultato2);
        System.out.println(risultato3);

    }


}