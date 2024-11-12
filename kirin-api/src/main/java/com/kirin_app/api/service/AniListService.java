package com.kirin_app.api.service;

import com.kirin_app.api.entity.AniList;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class AniListService {
    private final WebClient webClient;
    private final ObjectMapper objectMapper;

    public AniListService(WebClient.Builder webClientBuilder, ObjectMapper objectMapper) {
        this.webClient = webClientBuilder.baseUrl("https://graphql.anilist.co").build();
        this.objectMapper = objectMapper;
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

        try {
            String jsonBody = objectMapper.writeValueAsString(requestBody);
            System.out.println("Corpo da requisição (JSON): " + jsonBody);

            return webClient.post()
                    .uri("/")
                    .header("Content-Type", "application/json")
                    .header("Accept", "application/json")
                    .bodyValue(jsonBody)
                    .retrieve()
                    .bodyToMono(AniList.class)
                    .doOnError(error -> System.err.println("Erro na requisição: " + error.getMessage()))
                    .doOnSuccess(response -> System.out.println("Resposta da API: " + response));
        } catch (Exception e) {
            System.err.println("Erro ao converter o corpo para JSON: " + e.getMessage());
            return Mono.empty();
        }
    }
}
