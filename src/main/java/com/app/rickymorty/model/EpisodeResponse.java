package com.app.rickymorty.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class EpisodeResponse {

    private Info info;
    private List<Episode> results;
}
