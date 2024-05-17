package it.epicode.progetto.spring.service;

import it.epicode.progetto.spring.entities.Prenotazione;
import it.epicode.progetto.spring.entities.Utente;
import it.epicode.progetto.spring.repository.PrenotazioneRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Slf4j
@Service
public class PrenotazioneService {


    @Autowired
    PrenotazioneRepository prenotazioniDao;

    @Autowired
    PostazioneService postazioneService;

    public Prenotazione save(Prenotazione prenotazione){
        return prenotazioniDao.save(prenotazione);
    }




    public Prenotazione crea(Long postazioneId, Utente utenti, LocalDate dataPrenotazione){
        var postazione = postazioneService.findById(postazioneId);
        if(postazione == null){
            log.info("Non c'è la postazione che stai cercando");
            return null;
        }else if((postazione.getOccupantiMax() - prenotazioniDao.findBydataPrenotazioneAndPostazioniId(dataPrenotazione, postazione.getId()).size()) == 0){
            log.info("Non è possibile prenotare, posti esauriti per la data " + dataPrenotazione);
            return null;
        }else{
            log.info("Prenotazione effettuata" );
            return new Prenotazione(postazione, utenti, dataPrenotazione);
        }

    }
}
