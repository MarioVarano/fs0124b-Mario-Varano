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



    public Evento save(EventoRequest body) {
        var ute = isOrganizzatore(body.utenteid());
        if (ute != null) {
            var event = Evento.builder()
                    .withTitolo(body.titolo())
                    .withDescrizione(body.descrizione())
                    .withData(body.data())
                    .withLuogo(body.luogo())
                    .withNumeroPosti(body.numeroPosti())
                    .build();
            evento.save(event);
            ute.addEvento(event);
            utente.save(ute);
            return event;
        } else throw new RuntimeException("Utente non autorizzato");
    }

    public Utente isOrganizzatore(Long id) {
        var ute = utente.findById(id).orElseThrow(() -> new RuntimeException("Utente non esistente"));
        if (ute.getRuolo().getNome().equals("organizzatore")) return ute;
        else return null;
    }


}

