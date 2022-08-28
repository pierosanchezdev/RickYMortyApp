package com.app.rickymorty.service.impl;

import com.app.rickymorty.client.RickMortyApiClient;
import com.app.rickymorty.model.LocationResponse;
import com.app.rickymorty.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocationServiceImpl implements LocationService  {

    @Autowired
    private RickMortyApiClient client;

    @Override
    public LocationResponse getLocations() {
        return client.getAllLocations();
    }
}
