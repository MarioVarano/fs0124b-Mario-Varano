package data;


import jakarta.persistence.*;

@Entity
@Table( name = "Libreria")
@DiscriminatorColumn(name = "tipo_dato", discriminatorType = DiscriminatorType.INTEGER)
@NamedQueries({
        @NamedQuery(name = "trova_per_anno", query = "SELECT e FROM Catalogo e WHERE e.annoPubblicazione = :anno")
})


public abstract class Catalogo extends Base {
   @GeneratedValue
    private Integer isbn;
    @Column(length = 100, nullable = false)
    private String titolo;
    private Integer annoPubblicazione;
    private int numeroPagine;

    public Catalogo() {
    }


    public Catalogo(long id, String titolo, Integer annoPubblicazione, int numeroPagine) {
        super(id);
        this.titolo = titolo;
        this.annoPubblicazione = annoPubblicazione;
        this.numeroPagine = numeroPagine;
    }

    public Integer getIsbn() {
        return isbn;
    }

    public void setIsbn(Integer isbn) {
        this.isbn = isbn;
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

    public int getNumeroPagine() {
        return numeroPagine;
    }

    public void setNumeroPagine(int numeroPagine) {
        this.numeroPagine = numeroPagine;
    }

    @Override
    public String toString() {
        return super.toString() +"Catalogo{" +
                "isbn='" + isbn + '\'' +
                ", titolo='" + titolo + '\'' +
                ", annoPubblicazione=" + annoPubblicazione +
                ", numeroPagine=" + numeroPagine +
                '}';
    }
}
