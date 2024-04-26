package data;
//utilizzo una enum per i valori della periodicità
public class Riviste extends Catalogo{
    private Periodicita periodicità;

    public Riviste(String titolo, int annoPubblicazione, int numeroPagine, Periodicita periodicità) {
        super(titolo, annoPubblicazione, numeroPagine);
        this.periodicità = periodicità;
    }
}
