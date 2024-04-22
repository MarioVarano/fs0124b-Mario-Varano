import org.slf4j.LoggerFactory;

import java.util.Random;
import java.util.Scanner;
import java.util.logging.Logger;

public class esercizio1 {
    private int[] array = new int[5];

    public esercizio1(){
        for(int i = 0; i<5; i++){
            array[i] = new Random().nextInt(1,11);
        }
        stampa();
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Inserisci un numero");
            int numero = scanner.nextInt();
            if(numero == 0){
                break;
            }
            scanner.nextLine();
            System.out.println("Inserisci posizione");
            int posizione = scanner.nextInt();
            if(posizione > 5 ){
                throw new arrayLimiteException("hai superato limite array");
            }
            scanner.nextLine();
            array[posizione] = numero;
            stampa();
            i++;
        }while (true);
    }


    public void stampa(){
        for(int i = 0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

