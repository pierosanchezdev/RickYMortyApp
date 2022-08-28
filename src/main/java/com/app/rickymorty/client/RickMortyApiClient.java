package com.app.rickymorty.client;

import com.app.rickymorty.model.CharacterResponse;
import com.app.rickymorty.model.EpisodeResponse;
import com.app.rickymorty.model.LocationResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "rickmortyapi", url = "https://rickandmortyapi.com/api/")
public interface RickMortyApiClient {

    @GetMapping("/character")
    CharacterResponse getAllCharacters();

    @GetMapping("location")
    LocationResponse getAllLocations();

    @GetMapping("episode")
    EpisodeResponse getAllEpisodes();

}
