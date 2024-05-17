package it.epicode.progetto.spring.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "prenotazioni")
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Data
public class Prenotazione extends Base{
@OneToOne
@JoinColumn(name = "postazione_id")
private Postazioni postazioni;
@ManyToOne
@JoinColumn(name = "utente_id")
private Utente utenti;
private LocalDate dataPrenotazione;
private LocalDate dataScadenza;


    public Prenotazione( Postazioni postazioni, Utente utenti, LocalDate dataPrenotazione) {
        this.postazioni = postazioni;
        this.utenti = utenti;
        this.dataPrenotazione = dataPrenotazione;
        this.dataScadenza = dataPrenotazione.plusDays(1);
    }
}
