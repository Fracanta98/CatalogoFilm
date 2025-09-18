package com.example.catalogo.service;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.catalogo.models.Film;
@Service
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

    // Add film
    public Film addFilm(Film f) {
        f.setId(nextId++);
        listaFilm.add(f);
        return f;
    }
    
    public Optional<Film> deleteById(int id) { //delete
        Optional<Film> film = getFilmById(id);
        film.ifPresent(listaFilm::remove);
        return film;
    }


    
    public Optional<Film> aggiornaFilm(int id, Film f) {
        return listaFilm.stream()  //stream() inizializza una serie di operazini sulla lista quindi filter map ecc
            .filter(a -> a.getId() == id)
            .findFirst()
            .map(a -> {
                a.setTitolo(f.getTitolo());
                a.setGenere(f.getGenere());
                a.setAnno(f.getAnno());
                a.setRegista(f.getRegista());
                return a; 
        });
}

    
    public Optional<Film> getFilmByTitolo(String tit) {   
    for (Film f : listaFilm) {                  
        if (f.getTitolo() == tit) {
            return Optional.of(f); 
        }
        }
        return Optional.empty(); 
    } 

}
    

