package it.epicode.Restful.controllers;


import it.epicode.Restful.esercizio.entities.Autore;
import it.epicode.Restful.services.AutoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/autore")
public class AutoreController {


    @Autowired
    AutoreService service;



    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public Autore salva(@RequestBody Autore body){
        System.out.println(body);
        return service.save(body);
    }



    @GetMapping("")
    public List<Autore> getAutore() {return service.getAll();}


    @GetMapping("/{autoreId}")
    public Optional<Autore> findById(@PathVariable Long autoreId){
        return service.cercaId(autoreId);
    }
}
