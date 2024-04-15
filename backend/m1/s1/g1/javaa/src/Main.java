//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int risultato = moltiplicazione(20,4);
        String risultato2 = concatena(1, "ciao");

        System.out.println(risultato);
        System.out.println(risultato2);


    }


    public static int moltiplicazione(int a, int b){
        int c = a*b;
        return c;
    }

    public static String concatena(int a, String b){
        String d = a + b;
        return d;
    }
}