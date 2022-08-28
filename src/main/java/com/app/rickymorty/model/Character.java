package com.app.rickymorty.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Character {

    private Integer id;
    private String name;
    private String status;
    private String species;
    private String type;
    private String gender;
    private UrlData origin;
    private UrlData location;
    private String image;
    private List<String> episode;
    private String url;
    private String created;
}
