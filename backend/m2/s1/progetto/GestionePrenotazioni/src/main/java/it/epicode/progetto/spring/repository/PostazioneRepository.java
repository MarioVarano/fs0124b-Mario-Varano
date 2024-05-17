package it.epicode.progetto.spring.repository;

import it.epicode.progetto.spring.entities.Postazioni;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostazioneRepository extends JpaRepository<Postazioni, Long> {
}
