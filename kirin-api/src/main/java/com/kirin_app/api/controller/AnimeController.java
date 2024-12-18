package com.kirin_app.api.controller;

import com.kirin_app.api.entity.AniList;
import com.kirin_app.api.service.AniListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;
import java.util.Map;

@RestController
@RequestMapping("/api/animes")
@CrossOrigin(origins = "http://localhost:3000")
public class AnimeController {

    private final AniListService aniListService;

    @Autowired
    public AnimeController(AniListService aniListService) {
        this.aniListService = aniListService;
    }

    @PostMapping("/search")
    public Mono<AniList> searchAnime(@RequestBody Map<String, String> request) {
        String animeName = request.get("animeName");
        return aniListService.searchAnimeByName(animeName);
    }
}
