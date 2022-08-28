package com.app.rickymorty.service.impl;

import com.app.rickymorty.client.RickMortyApiClient;
import com.app.rickymorty.model.CharacterResponse;
import com.app.rickymorty.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CharacterServiceImpl implements CharacterService {

    @Autowired
    private RickMortyApiClient client;

    @Override
    public CharacterResponse getCharacters() {
        return client.getAllCharacters();
    }
}
