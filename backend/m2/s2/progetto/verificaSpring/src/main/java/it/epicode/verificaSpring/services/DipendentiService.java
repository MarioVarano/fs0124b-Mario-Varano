package it.epicode.verificaSpring.services;

import it.epicode.verificaSpring.controllers.records.DipendentiRequest;
import it.epicode.verificaSpring.entities.Dipendenti;
import it.epicode.verificaSpring.repository.DipendentiRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Slf4j
public class DipendentiService {

    @Autowired
    DipendentiRepository dipendenti;



    public Dipendenti save(DipendentiRequest d){
        Dipendenti dipendente = new Dipendenti(
                d.username(),
                d.name(),
                d.cognome(),
                d.email()
        );
        return dipendenti.save(dipendente);
    }


    public Dipendenti findById(Long id){
        var d = dipendenti.findById(id);
        return d.orElseThrow();

    }

    public Dipendenti delete(Long id){
        var c = dipendenti.findById(id);
        dipendenti.deleteById(id);
        return c.orElseThrow();
    }


    public List<Dipendenti> getAll(){
        return dipendenti.findAll();
    }

    public Dipendenti update(Long id, DipendentiRequest dipendente){
        Dipendenti dipe = dipendenti.findById(id).orElseThrow(() -> new RuntimeException("Dipendente non c'è"));
        dipe.setUsername(dipendente.username());
        dipe.setName(dipendente.name());
        dipe.setCognome(dipendente.cognome());
        dipe.setEmail(dipendente.email());


        return dipendenti.save(dipe);

    }

}
