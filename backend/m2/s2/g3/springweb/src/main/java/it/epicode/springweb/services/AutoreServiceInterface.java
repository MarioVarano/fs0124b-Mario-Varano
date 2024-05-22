package it.epicode.springweb.services;

import it.epicode.springweb.entities.Autore;

import java.util.List;
import java.util.Optional;


public interface AutoreServiceInterface {

    List<Autore> getAutori();

    Optional<Autore> getAutoreById(Long Id);

    Autore save(Autore autore);

   void Update(Long autoreId, Autore autore) throws Exception;

    Autore delete(Long autoreId);
}
