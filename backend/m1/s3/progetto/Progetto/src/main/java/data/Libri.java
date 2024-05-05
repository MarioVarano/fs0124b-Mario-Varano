package data;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

//attributi diversi per la classe Libri
@Entity
@Table(name = "Libri")
@DiscriminatorValue("0")
public class Libri extends Catalogo{
    private String autore;
    private String genere;



    public Libri() {
    }

    public Libri(long id, String titolo, Integer annoPubblicazione, int numeroPagine, String autore, String genere) {
        super(id, titolo, annoPubblicazione, numeroPagine);
        this.autore = autore;
        this.genere = genere;
    }


    @Override
    public String toString() {
        return super.toString() + "Libri{" +
                "autore='" + autore + '\'' +
                ", genere='" + genere + '\'' +
                '}';
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }
}
