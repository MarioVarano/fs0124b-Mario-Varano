package it.epicode.verificaSpring.repository;

import it.epicode.verificaSpring.entities.Dispositivi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DispositiviRepository extends JpaRepository<Dispositivi, Long> {
}
