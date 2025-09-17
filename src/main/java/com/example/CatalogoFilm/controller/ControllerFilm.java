package com.example.CatalogoFilm.controller;

import com.example.CatalogoFilm.models.Film;
import com.example.CatalogoFilm.service.CatalogoFilmService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")

public class ControllerFilm {
    
    //creazione oggetto service e sua accesso tramite metodo public
    private final CatalogoFilmService service;

    public ControllerFilm (CatalogoFilmService service) {
        this.service = service;
    }

    // metodo POST 
    @PostMapping("/aggiungi")
    public ResponseEntity<Film> postFilm (@RequestBody Film film){
        Film filmCreato = service.addFilm(film);
        return ResponseEntity.ok().body(filmCreato);
    }
}