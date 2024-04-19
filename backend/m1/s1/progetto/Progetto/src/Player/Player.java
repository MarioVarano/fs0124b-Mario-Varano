package Player;

import java.util.Scanner;
//inizializzo l'array che conterrà gli elementi multimediali
public class Player {
    private Multimediale[] array = new Multimediale[5];

//questa funzione in base al tipo di dato che fornisco mi chiede di inserire i dati della specifica classe, ripeto per 5 volte
    //ho un do while che mi permette di selezionare un elemento dall'array fino a quando digito 0, quando lo digito esco dal programma
    public void impostaParametriDaTastiera() {
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<5;i++){
            System.out.println("Inserisci il tipo di contenuto:");
            String tipo = scanner.nextLine();
            switch (tipo){
                case"audio":
                    System.out.println("Inserisci il titolo:");
                    String titolo = scanner.nextLine();
                    scanner.nextLine();
                    System.out.println("Inserisci il volume:");
                    int volume = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Inserisci il durata:");
                    int durata = scanner.nextInt();
                    scanner.nextLine();
                    array[i] = new Audio(titolo,volume,durata);
                    break;
                case"video":
                    System.out.println("Inserisci il titolo:");
                    String titoloV = scanner.nextLine();
                    scanner.nextLine();
                    System.out.println("Inserisci il volume:");
                    int volumeV = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Inserisci il durata:");
                    int durataV= scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Iserisci la luminosità:");
                    int luminositàV = scanner.nextInt();
                    scanner.nextLine();
                    array[i] = new Video(titoloV,volumeV,durataV,luminositàV);
                    break;
                case "immagine":
                    System.out.println("Inserisci il titolo:");
                    String titoloI = scanner.nextLine();
                    scanner.nextLine();
                    System.out.println("Iserisci la luminosità:");
                    int luminositàI = scanner.nextInt();
                    scanner.nextLine();
                    array[i] = new Immagine(titoloI,luminositàI);
                    break;
                default:
                    System.out.println("Hai sbagliato!");
            }
        }
        int i = 0;
        do {
            System.out.println("Inserisci un numero:");
            int elemento = scanner.nextInt();
            if (elemento == 0){
                break;
            }
            array[elemento].inizia();
            i++;
        } while(true);






    }


}

