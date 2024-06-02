package it.epicode.Ultimo.services;


import it.epicode.Ultimo.controllers.records.EventoRequest;
import it.epicode.Ultimo.entities.Evento;
import it.epicode.Ultimo.entities.Prenotazioni;
import it.epicode.Ultimo.entities.Utente;
import it.epicode.Ultimo.repositories.EventoRepository;
import it.epicode.Ultimo.repositories.PrenotazioniRepository;
import it.epicode.Ultimo.repositories.UtenteRepository;
import it.epicode.Ultimo.services.exceptions.PostiEsauritiException;
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
    @Autowired
    PrenotazioniRepository prenotazioni;



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


    public Evento update(Long id ,Evento e){
        Evento eve = evento.findById(id).orElseThrow(() -> new RuntimeException("Evento no c'è"));
        if(eve.getTitolo() != null) eve.setTitolo(e.getTitolo());
        if (eve.getData() != null) eve.setData(e.getData());
        if (eve.getLuogo()!= null) eve.setLuogo(e.getLuogo());
        if (eve.getDescrizione()!= null) eve.setDescrizione(e.getDescrizione());
        if (eve.getNumeroPosti()!= 0) eve.setNumeroPosti(e.getNumeroPosti());
        evento.save(eve);
        return eve;

    }

    public Evento prenotazione(Long idUtente, Long idEvento){
        if(isOrganizzatore(idUtente) == null){
            var ute = utente.findById(idUtente).orElseThrow(() -> new RuntimeException("Utente non trovato"));
            var eve = evento.findById(idEvento).orElseThrow(() -> new RuntimeException("Evento non trovato"));
            if(eve.getNumeroPosti() == 0) throw new PostiEsauritiException("Non ci sono posti disponibili");
            else if(prenotazioni.findByUtenteIdAndEventoId(ute.getId(),eve.getId()) != null) throw new PostiEsauritiException("Hai già una prenotazione per questo evento");
            else{
                eve.setNumeroPosti(eve.getNumeroPosti()-1);
                evento.save(eve);
                prenotazioni.save(new Prenotazioni(eve,ute));
                return eve;
            }
        }else throw new RuntimeException("Non sei autorizzato");
    }





}

