package it.epicode.progetto.spring.service;

import it.epicode.progetto.spring.entities.Postazioni;
import it.epicode.progetto.spring.entities.Prenotazione;
import it.epicode.progetto.spring.entities.Utente;
import it.epicode.progetto.spring.repository.PrenotazioneRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Slf4j
@Service
public class PrenotazioneService {


    @Autowired
    PrenotazioneRepository prenotazioni;

    @Autowired
    PostazioneService postazioneService;


    public Optional<Prenotazione> crea(Long postazioneId, Utente utenti, LocalDate dataPrenotazione){
        var postazione = postazioneService.findById(postazioneId);
        if(postazione == null){
            log.info("Non c'è la postazione che stai cercando");
        }else if(postazione.getOccupantiMax() - postazione.getOccupati() == 0){
            log.info("Non è possibile prenotare, posti esauriti");
            return null;
        }else{
            log.info("Prenotazione effettuata" );
        }
         return Optional.of(new Prenotazione(postazione, utenti, dataPrenotazione));
    }
}
