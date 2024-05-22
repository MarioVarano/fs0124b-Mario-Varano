package it.epicode.springweb.controllers;


import it.epicode.springweb.entities.Autore;
import it.epicode.springweb.services.AutoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/autori")
public class AutoreController {


    @Autowired
    AutoreService autori;



    @GetMapping
    public ResponseEntity<List<Autore>> getAutori(){
        return new ResponseEntity<>(autori.getAutori(),null,HttpStatus.ACCEPTED);
    }

    @GetMapping("{id}")
    public ResponseEntity<Autore> getAutore(@PathVariable Long id){
        return new ResponseEntity<>(autori.getAutoreById(id).orElseThrow(),null, HttpStatus.FOUND);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Autore> creaAutore(@RequestBody Autore body){
        return new ResponseEntity<>(autori.Crea(body.getNome(), body.getCognome(), body.getEmail(), body.getDataDiNascita()),null,HttpStatus.CREATED);

    }
}

