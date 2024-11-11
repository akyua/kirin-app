package com.kirin_app.api.service;

import com.kirin_app.api.entity.AniList;
import com.kirin_app.api.entity.Anime;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;
import java.util.Map;

@Service
public class AniListService {
    private final WebClient webClient;

    public AniListService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("https://graphql.anilist.co").build();
    }

    public Mono<AniList> searchAnimeByName(String animeName) {
        String query = "query ($name: String) { " +
                "  Media(search: $name, type: ANIME) { " +
                "    id " +
                "    title { " +
                "      romaji " +
                "      english " +
                "      native " +
                "    } " +
                "    description " +
                "  } " +
                "}";

        Map<String, Object> requestBody = Map.of(
                "query", query,
                "variables", Map.of("name", animeName)
        );

        return webClient.post()
                .bodyValue(requestBody)
                .retrieve()
                .bodyToMono(AniList.class);
    }
}
