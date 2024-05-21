package it.epicode.Restful.repositories;

import it.epicode.Restful.esercizio.entities.Autore;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AutoreRepository  extends JpaRepository<Autore, Long> {


    //void delete(Long id);

   //Optional<Autore> findById(Long Id);
}
