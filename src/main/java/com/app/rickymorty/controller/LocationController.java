package com.app.rickymorty.controller;

import com.app.rickymorty.model.LocationResponse;
import com.app.rickymorty.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/location")
public class LocationController {

    @Autowired
    private LocationService service;

    @GetMapping("/list")
    public ResponseEntity<LocationResponse> getLocations(){
        return ResponseEntity.ok(service.getLocations());
    }
}
