package data;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

//utilizzo una enum per i valori della periodicità
@Entity
@Table(name= "Riviste")
@DiscriminatorValue("1")
public class Riviste extends Catalogo{
    public Periodicita getPeriodicità() {
        return periodicità;
    }

    public void setPeriodicità(Periodicita periodicità) {
        this.periodicità = periodicità;
    }

    private Periodicita periodicità;



    public Riviste() {
    }


    public Riviste(long id,  String titolo, Integer annoPubblicazione, int numeroPagine, Periodicita periodicità) {
        super(id, titolo, annoPubblicazione, numeroPagine);
        this.periodicità = periodicità;
    }

    @Override
    public String toString() {
        return super.toString() + "Riviste{" +
                "periodicità=" + periodicità +
                '}';
    }
}






