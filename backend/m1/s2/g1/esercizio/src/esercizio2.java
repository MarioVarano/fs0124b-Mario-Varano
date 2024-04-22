import java.util.Scanner;

public class esercizio2 {

    public esercizio2(){
        System.out.println("Quanti km?");
        Scanner scanner = new Scanner(System.in);
            int km = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Litri di carburante consumati?");
            int litri = scanner.nextInt();
            if(litri <= 0) throw new litriZero();
            scanner.nextLine();
            int risultato = km / litri;
            System.out.println("km/litro percorsi: " + risultato);
    }
}
