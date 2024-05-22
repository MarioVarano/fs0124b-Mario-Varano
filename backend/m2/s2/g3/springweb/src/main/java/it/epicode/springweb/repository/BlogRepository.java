package it.epicode.springweb.repository;

import it.epicode.springweb.entities.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface BlogRepository extends JpaRepository<Blog, Long>,
        PagingAndSortingRepository<Blog,Long> {
}
