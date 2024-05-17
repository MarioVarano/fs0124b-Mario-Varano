package it.epicode.progetto.spring.service;

import it.epicode.progetto.spring.entities.Postazioni;
import it.epicode.progetto.spring.entities.TipoPostazione;
import it.epicode.progetto.spring.repository.PostazioneRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class PostazioneService {

    @Autowired
    PostazioneRepository postazioniDao;

    public void save(Postazioni postazioni){postazioniDao.save(postazioni);}


    public Postazioni findById(Long id){
        return postazioniDao.findById(id).orElseThrow();
    }

    public void cercaPostazione(TipoPostazione tipo, String citta){
        var ris = postazioniDao.findBytipoAndEdificioCitta(tipo, citta);
        if (ris.size() != 0){
            for(Postazioni e: ris){
                log.info(e.toString());
            }
        } else log.warn("Nessun risultato trovato.");
    }


}
