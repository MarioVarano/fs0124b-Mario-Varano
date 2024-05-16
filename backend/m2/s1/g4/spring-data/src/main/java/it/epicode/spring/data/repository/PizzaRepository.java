package it.epicode.spring.data.repository;

import it.epicode.spring.data.entities.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;


public interface PizzaRepository extends JpaRepository<Pizza, Long> {
}
