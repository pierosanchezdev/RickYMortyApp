package com.app.rickymorty.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class LocationResponse {

    private Info info;
    private List<Location> results;
}
