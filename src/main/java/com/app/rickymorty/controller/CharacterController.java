package com.app.rickymorty.controller;

import com.app.rickymorty.model.CharacterResponse;
import com.app.rickymorty.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/character")
public class CharacterController {

    @Autowired
    private CharacterService service;

    @GetMapping("/list")
    public ResponseEntity<CharacterResponse> getCharcters(){
        return ResponseEntity.ok(service.getCharacters());
    }
}
