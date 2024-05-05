package data;


import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@DiscriminatorColumn(name = "Elemento_catalogo", discriminatorType = DiscriminatorType.STRING)

public abstract class Catalogo extends Base {
    @Id
    private Integer ISBN;
    private String titolo;
    private Integer annoPubblicazione;
    private Integer numeroPagine;
    
    
    
   


    public Catalogo( Integer ISBN, String titolo, Integer annoPubblicazione, Integer numeroPagine) {
        this.ISBN = ISBN;
        this.titolo = titolo;
        this.annoPubblicazione = annoPubblicazione;
        this.numeroPagine = numeroPagine;
    }

    public Catalogo() {
    }



    public  Integer getISBN() {
        return ISBN;
    }

    public void setISBN(Integer ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public Integer getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    public void setAnnoPubblicazione(Integer annoPubblicazione) {
        this.annoPubblicazione = annoPubblicazione;
    }

    public Integer getNumeroPagine() {
        return numeroPagine;
    }

    public void setNumeroPagine(Integer numeroPagine) {
        this.numeroPagine = numeroPagine;
    }

    @Override
    public String toString() {
        return super.toString() + "Catalogo{" +
                "ISBN=" + ISBN +
                ", titolo='" + titolo + '\'' +
                ", annoPubblicazione=" + annoPubblicazione +
                ", numeroPagine=" + numeroPagine +
                '}';
    }
}


