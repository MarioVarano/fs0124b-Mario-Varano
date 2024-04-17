package Telefono;

public class Sim {
    private String numero;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }

    public Chiamate[] getUltime() {
        return ultime;
    }

    public void setUltime(Chiamate[] ultime) {
        this.ultime = ultime;
    }

    private int credito;
    private Chiamate[] ultime;

    Sim(String n){
        numero = n;
        credito = 0;
        Chiamate[] chiamate = new Chiamate[0];
    }

    public static void stampaSim(Sim mia){
        System.out.println("numero: "  + mia.numero + " " + "credito: " + mia.credito +" " +  "chiamate: " + mia.ultime);
    }
}
