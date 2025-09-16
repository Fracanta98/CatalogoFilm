package com.example.CatalogoFilm;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;



public class CatalogoFilmService {
   
     private final List<Film> listaFilm = new ArrayList<>();
    private int nextId = 1; //contatore degli id che parte da 1

    public List<Film> getAllFilms() { //metodo per vedere tutti i film disponibili
        return listaFilm;
    }

  public Optional<Film> getFilmById(int id) {   //Optional perchè potrei non trovare niente e
    for (Film f : listaFilm) {                  //ritornare un null
        if (f.getId() == id) {
            return Optional.of(f); // Film trovato
        }
    }
    return Optional.empty(); // Nessun film trovato
    }
    
}
