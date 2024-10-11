package com.kirin_app.api.repository;

import com.kirin_app.api.entity.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RatingRepository extends JpaRepository<Rating, Long> {
    List<Rating> findByUserId(Long userId);
    List<Rating> findByAnimeId(Long animeId);
}
