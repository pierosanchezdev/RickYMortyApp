package com.app.rickymorty.service.impl;

import com.app.rickymorty.client.RickMortyApiClient;
import com.app.rickymorty.model.EpisodeResponse;
import com.app.rickymorty.service.EpisodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EpisodeServiceImpl implements EpisodeService {

    @Autowired
    private RickMortyApiClient client;

    @Override
    public EpisodeResponse getEpisodes() {
        return client.getAllEpisodes();
    }
}
