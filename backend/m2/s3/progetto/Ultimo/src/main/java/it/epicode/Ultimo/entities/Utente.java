package it.epicode.Ultimo.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name= "utenti")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Utente extends Base{
    private String nome;
    @ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    @JoinColumn(name = "ruolo_id")
    private Ruoli ruolo;
    @OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    @JoinColumn(name = "utente_id")
    private List<Evento> evento;

    @Builder(setterPrefix = "with")
    public Utente(String nome, Ruoli ruolo) {
        this.nome = nome;
        this.ruolo = ruolo;
    }
    public void addEvento(Evento e) {
        this.evento.add(e);
    }
}


