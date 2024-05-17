package it.epicode.progetto.spring.service;

import it.epicode.progetto.spring.entities.AppConfig;
import it.epicode.progetto.spring.entities.Utente;
import it.epicode.progetto.spring.repository.UtenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UtenteService {


    @Autowired
    UtenteRepository utenteDao;


    public void save(Utente utente) {utenteDao.save(utente);}
}
