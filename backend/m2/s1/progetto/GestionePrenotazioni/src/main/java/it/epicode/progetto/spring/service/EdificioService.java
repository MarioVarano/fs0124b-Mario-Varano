package it.epicode.progetto.spring.service;

import it.epicode.progetto.spring.entities.Edificio;
import it.epicode.progetto.spring.repository.EdificioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EdificioService {


    @Autowired
    EdificioRepository edificioDao;

    public void save(Edificio edificio){edificioDao.save(edificio);}
}
