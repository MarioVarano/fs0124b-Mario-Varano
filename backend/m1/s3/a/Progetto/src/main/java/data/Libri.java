package data;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

//attributi diversi per la classe Libri
@Entity
@DiscriminatorValue("libri")

public class Libri extends Catalogo{
    private String autore;
    private String genere;



    public Libri() {
    }

    @Override
    public Integer getISBN() {
        return super.getISBN();
    }

    @Override
    public void setISBN(Integer ISBN) {
        super.setISBN(ISBN);
    }

    public Libri( Integer ISBN, String titolo, Integer annoPubblicazione, Integer numeroPagine, String autore, String genere) {
        super(ISBN, titolo, annoPubblicazione, numeroPagine);
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
