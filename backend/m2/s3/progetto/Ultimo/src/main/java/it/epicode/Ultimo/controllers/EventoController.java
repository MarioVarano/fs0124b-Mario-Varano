package it.epicode.Ultimo.controllers;


import it.epicode.Ultimo.services.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/evento")
public class EventoController {


    @Autowired
    private EventoService eventoService;
}
