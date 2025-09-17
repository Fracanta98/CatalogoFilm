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

    // Add film
    public Film addFilm(Film f) {
        f.setId(nextId++);
        listaFilm.add(f);
        return f;
    }
    
    // Delete
    public boolean deleteById(int id) {
    return listaFilm.removeIf(f -> f.getId() == id);
    }


    
    public void aggiornaFilm(int id, Film f){ //funzione per aggiornare
         for (Film a : listaFilm){
            if(a.getId() == id){
                a.setTitolo(f.getTitolo());
                a.setGenere(f.getGenere());
                a.setAnno(f.getAnno());
                a.setRegista(f.getRegista());
            }

         }

    
    }

    public Film getByTitolo(String tit) {   // Ricerca per titolo
      for (Film f : listaFilm) {
          if (f.getTitolo().equalsIgnoreCase(tit)) {
              return f; 
          }
      }
      return null; // se non trova nessun film
}
}
