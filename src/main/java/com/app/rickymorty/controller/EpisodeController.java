package com.app.rickymorty.controller;

import com.app.rickymorty.model.EpisodeResponse;
import com.app.rickymorty.service.EpisodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/episode")
public class EpisodeController {

    @Autowired
    private EpisodeService service;

    @GetMapping("/list")
    public ResponseEntity<EpisodeResponse> getCharcters(){
        return ResponseEntity.ok(service.getEpisodes());
    }
}
