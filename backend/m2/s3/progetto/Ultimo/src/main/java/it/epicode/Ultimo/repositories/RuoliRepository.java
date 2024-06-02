package it.epicode.Ultimo.repositories;

import it.epicode.Ultimo.entities.Ruoli;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RuoliRepository extends JpaRepository<Ruoli, Long> {
}
