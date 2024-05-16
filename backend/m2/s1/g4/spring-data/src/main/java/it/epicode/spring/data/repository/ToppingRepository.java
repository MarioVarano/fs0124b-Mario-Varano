package it.epicode.spring.data.repository;

import it.epicode.spring.data.entities.Topping;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToppingRepository extends JpaRepository<Topping,Long> {
}
