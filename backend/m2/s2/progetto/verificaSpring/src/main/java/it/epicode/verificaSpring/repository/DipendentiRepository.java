package it.epicode.verificaSpring.repository;

import it.epicode.verificaSpring.entities.Dipendenti;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DipendentiRepository extends JpaRepository<Dipendenti, Long> {
}
