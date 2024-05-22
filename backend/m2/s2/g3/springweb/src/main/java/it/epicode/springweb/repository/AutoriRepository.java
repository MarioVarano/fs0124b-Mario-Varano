package it.epicode.springweb.repository;

import it.epicode.springweb.entities.Autore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface AutoriRepository extends JpaRepository<Autore, Long> ,
        PagingAndSortingRepository<Autore, Long> {
}
