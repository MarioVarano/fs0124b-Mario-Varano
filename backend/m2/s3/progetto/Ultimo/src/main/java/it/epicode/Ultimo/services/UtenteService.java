package it.epicode.Ultimo.services;

import it.epicode.Ultimo.controllers.records.UtenteRequest;
import it.epicode.Ultimo.entities.Ruoli;
import it.epicode.Ultimo.entities.Utente;
import it.epicode.Ultimo.repositories.RuoliRepository;
import it.epicode.Ultimo.repositories.UtenteRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UtenteService {

    @Autowired
    UtenteRepository utente;
    @Autowired
    RuoliRepository ruoli;


    public Utente save(UtenteRequest u){
        Ruoli r = ruoli.findById(u.ruoloid()).orElseThrow(() -> new RuntimeException("ruolo non c'è"));
        var ut = Utente.builder().withNome(u.nome()).withEmail(u.email()).withPassword(u.password()).withRuolo(r).build();
        return utente.save(ut);
    }






}
