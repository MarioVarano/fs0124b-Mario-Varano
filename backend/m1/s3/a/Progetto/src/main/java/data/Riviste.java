package data;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

//utilizzo una enum per i valori della periodicità
@Entity
@Table(name= "Riviste")
@DiscriminatorValue("1")
public class Riviste extends Catalogo{

    public Riviste(Integer ISBN, String titolo, Integer annoPubblicazione, Integer numeroPagine, Periodicita periodicità) {
        super(ISBN, titolo, annoPubblicazione, numeroPagine);
        this.periodicità = periodicità;
    }

    public Periodicita getPeriodicità() {
        return periodicità;
    }

    public void setPeriodicità(Periodicita periodicità) {
        this.periodicità = periodicità;
    }

    private Periodicita periodicità;



    public Riviste() {
    }





    @Override
    public String toString() {
        return super.toString() + "Riviste{" +
                "periodicità=" + periodicità +
                '}';
    }
}






