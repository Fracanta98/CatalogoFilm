package com.example.CatalogoFilm;

import com.example.CatalogoFilm.Film;
import com.example.CatalogoFilm.CatalogoFilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")

public class ControllerFilm {
   
    private final CatalogoFilmService service;

    public ControllerFilm (CatalogoFilmService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Film> postFilm (@RequestBody Film film){
        Film filmCreato = service.addFilm(film);
        return ResponseEntity.ok().body(filmCreato);
    }
}