package com.example.catalogo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.catalogo.models.Film;
import com.example.catalogo.service.CatalogoFilmService;

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

    @GetMapping("/lista")   //get per vedere tutti i film
    public List<Film> getAllFilms() {
        return service.getAllFilms();
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateFilm(@PathVariable int id, @RequestBody Film film) {
        boolean filmAggiornato = service.aggiornaFilm(id, film);
        if (filmAggiornato == true) 
            return ResponseEntity.ok("Film aggiornato correttamente");
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Film> getById(@PathVariable int id) {
    return service.getFilmById(id)
                  .map(film -> ResponseEntity.ok(film)) 
                  .orElse(ResponseEntity.notFound().build());

    }

    @DeleteMapping("/cancella/{id}") //delete
    public ResponseEntity<Film> deleteFilm(@PathVariable int id) {
    return service.deleteById(id)
                  .map(ResponseEntity::ok)
                  .orElse(ResponseEntity.notFound().build());
}
    
}
