package esercizio;

import java.util.*;

public class Esercizio2 {


    List<Integer> lista = new ArrayList<>();
    List<Integer> contrario = new ArrayList<>();

    public Esercizio2() {
        System.out.println("Inserisci un intero: ");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        scanner.nextLine();

        for(int i= 0; i<numero; i++){
            int random = new Random().nextInt(1,101);
            lista.add(random);
            Collections.sort(lista);
        }
        for(Integer el: lista){
            System.out.println(el);
        }
    }

    public void Esercizio3(List<Integer> lista){

       for(Integer el= lista.size(); el>0; el--){
           contrario.add(lista.get(el));
       }
        System.out.println(contrario);

    }
}
