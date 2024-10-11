package com.kirin_app.api.repository;

import com.kirin_app.api.entity.Anime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnimeRepository extends JpaRepository<Anime, Long> {
    List<Anime> findByGenre(String genre);
    List<Anime> findByTitleContaining(String title);
}
