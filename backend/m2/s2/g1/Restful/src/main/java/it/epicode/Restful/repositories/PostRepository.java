package it.epicode.Restful.repositories;

import it.epicode.Restful.esercizio.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
