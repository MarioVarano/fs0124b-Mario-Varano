package it.epicode.Ultimo.services;


import it.epicode.Ultimo.controllers.records.EventoRequest;
import it.epicode.Ultimo.entities.Evento;
import it.epicode.Ultimo.entities.Utente;
import it.epicode.Ultimo.repositories.EventoRepository;
import it.epicode.Ultimo.repositories.UtenteRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EventoService {


    @Autowired
    EventoRepository evento;
    @Autowired
    UtenteRepository utente;


    public Evento save(EventoRequest e){
        Evento ev = new Evento(
                e.nome(),
                e.descrizione(),
                e.data(),
                e.luogo(),
                e.numeroPosti()
        );
        return evento.save(ev);

    }

    public Evento creaOrIscrivi(Long idUtente, EventoRequest e){
        Utente ute = utente.findById(idUtente).orElseThrow(() -> new RuntimeException("L'utente non c'è"));
        if(ute.getRuolo().getNome().equals("utente")){
            Evento ev = new Evento(
                    e.nome(),
                    e.descrizione(),
                    e.data(),
                    e.luogo(),
                    e.numeroPosti()
            );
            ute.setEvento();
            return evento.save(ev);

        }

    }

}

