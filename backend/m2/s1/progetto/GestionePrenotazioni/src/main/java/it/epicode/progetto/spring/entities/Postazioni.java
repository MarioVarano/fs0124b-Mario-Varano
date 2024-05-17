package it.epicode.progetto.spring.entities;


import jakarta.persistence.*;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name="postazioni")

@Data
public class Postazioni extends Base{
    private String descrizione;
    private TipoPostazione tipo;
    private int occupantiMax;
    private int occupati = 0;
    @OneToOne
    @JoinColumn(name = "edificio_id")
    private Edificio edificio;

    @Builder(setterPrefix = "with")
    public Postazioni( String descrizione, TipoPostazione tipo, int occupantiMax,  Edificio edificio) {
        this.descrizione = descrizione;
        this.tipo = tipo;
        this.occupantiMax = occupantiMax;
        this.edificio = edificio;
    }

    public Postazioni() {
        ;
    }
}
