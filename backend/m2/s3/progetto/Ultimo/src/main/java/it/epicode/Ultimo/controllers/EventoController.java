package it.epicode.Ultimo.controllers;


import it.epicode.Ultimo.controllers.records.EventoRequest;
import it.epicode.Ultimo.controllers.records.UtenteRequest;
import it.epicode.Ultimo.entities.Evento;
import it.epicode.Ultimo.entities.Utente;
import it.epicode.Ultimo.services.EventoService;
import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/evento")
public class EventoController {


    @Autowired
    private EventoService eventoService;

    @PostMapping
    public ResponseEntity<Evento> saveEvento(@Validated @RequestBody EventoRequest request, BindingResult validator) throws BadRequestException {
        if (validator.hasErrors()) {
            throw new BadRequestException(String.valueOf(validator.getAllErrors()));
        }

        return ResponseEntity.ok(eventoService.save(request));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Evento> updateDipendenti(@PathVariable Long id, @Validated @RequestBody Evento request, BindingResult validator) throws BadRequestException {
        if(validator.hasErrors()){
            throw new BadRequestException(String.valueOf(validator.getAllErrors()));
        }
        Evento update = eventoService.update(id,request);
        return ResponseEntity.ok(update);
    }


    @PatchMapping("/prenota/{idUtente}/{idEvento}")
    public ResponseEntity<Evento> update(@PathVariable Long idUtente, @PathVariable Long idEvento){
        var prenotazione = eventoService.prenotazione(idUtente, idEvento);
        return ResponseEntity.ok(prenotazione);
    }

}
