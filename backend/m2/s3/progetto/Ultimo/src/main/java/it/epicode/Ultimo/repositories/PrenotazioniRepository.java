package it.epicode.Ultimo.repositories;

import it.epicode.Ultimo.entities.Prenotazioni;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrenotazioniRepository extends JpaRepository<Prenotazioni, Long> {


    Prenotazioni findByUtenteIdAndEventoId(Long idUtente, Long idEvento);
}
