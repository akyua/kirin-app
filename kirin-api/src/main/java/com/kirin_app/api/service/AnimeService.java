package com.kirin_app.api.service;

import com.kirin_app.api.entity.Anime;
import com.kirin_app.api.repository.AnimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.kirin_app.api.exceptions.MensagemUsuarioException;

import java.util.List;

@Service
public class AnimeService {
    @Autowired
    private AnimeRepository animeRepository;

    public List<Anime> getAllAnimes() {
        return animeRepository.findAll();
    }

    public Anime getAnimeById(Long id) {
        return animeRepository.findById(id)
                .orElseThrow(() -> new MensagemUsuarioException("Anime não encontrado!"));
    }

    public List<Anime> searchAnimeByGenre(String genre) {
        return animeRepository.findByGenre(genre);
    }

    public Anime createAnime(Anime anime) {
        return animeRepository.save(anime);
    }

    public Anime updateAnime(Long id, Anime animeDetails) {
        Anime anime = getAnimeById(id);
        anime.setTitle(animeDetails.getTitle());
        anime.setGenre(animeDetails.getGenre());
        anime.setDescription(animeDetails.getDescription());
        return animeRepository.save(anime);
    }

    public void deleteAnime(Long id) {
        animeRepository.deleteById(id);
    }
}
