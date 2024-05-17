package it.epicode.progetto.spring.service;

import it.epicode.progetto.spring.entities.Postazioni;
import it.epicode.progetto.spring.repository.PostazioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostazioneService {

    @Autowired
    PostazioneRepository postazioniDao;

    public void save(Postazioni postazioni){postazioniDao.save(postazioni);}


    public Postazioni findById(Long id){
        return postazioniDao.findById(id).orElseThrow();
    }
}
