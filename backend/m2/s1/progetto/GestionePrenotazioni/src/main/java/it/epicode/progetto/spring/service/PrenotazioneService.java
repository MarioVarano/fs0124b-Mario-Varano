package it.epicode.progetto.spring.service;

import it.epicode.progetto.spring.entities.Prenotazione;
import it.epicode.progetto.spring.entities.Utente;
import it.epicode.progetto.spring.repository.PrenotazioneRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

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



//crea una prenotazione solo se esiste la postazione che stai cercando
    //solo se per quella data è libera
    //solo se l'utente non ha già un'altra prenotazione
    //nell'else la salva

    public void crea(Long postazioneId, Utente utente, LocalDate dataPrenotazione){
        var postazione = postazioneService.findById(postazioneId);
        if(postazione == null){
            log.warn("Non esiste la postazione che stai cercando");
        }else if((postazione.getOccupantiMax() - prenotazioniDao.findBydataPrenotazioneAndPostazioniId(dataPrenotazione, postazione.getId()).size()) == 0){
            log.warn("Non è possibile prenotare, posti esauriti per la data " + dataPrenotazione);
        }else if(prenotazioniDao.findBydataPrenotazioneAndUtentiId(dataPrenotazione, utente.getId()) != null ){
            log.warn("Non puoi prenotare per lo stesso giorno");

        }else{
            log.info("Prenotazione effettuata" );
            prenotazioniDao.save(new Prenotazione(postazione, utente, dataPrenotazione));

        }

    }
}
