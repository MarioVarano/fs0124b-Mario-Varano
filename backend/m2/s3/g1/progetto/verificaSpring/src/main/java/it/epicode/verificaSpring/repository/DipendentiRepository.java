package it.epicode.verificaSpring.repository;

import it.epicode.verificaSpring.entities.Dipendenti;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface DipendentiRepository extends JpaRepository<Dipendenti, Long> {

    Optional<Dipendenti> findOneByUsernameAndPassword(String username,String password);
    Optional<Dipendenti> findOneByUsername(String username);
}
