# Catalogo di Film

## Descrizione del progetto

Il progetto consiste nella creazione di un API Java con Spring Boot che simula un Catalogo capace di gestire una collezione di film tramile le principali operazioni CRUD.

L'architettura comprende:
* Modello (film): Entità con attributi tra cui id, titolo, regista, anno e genere.
* Service (CatalogoFilm):gestisce la logica applicativa e la collezione dei film in memoria.
* Controller: Con gli endpoint HTTP interagisce con il catalogo.

La memoria non è gestita da un DB ma da una ArrayList, quindi non è stato implementato alcun database esterno per la persistenza dei dati o delle frittatine di pasta.

## Partecipanti al progetto

1. Cantarelli Francesco
2. Capone Roberto
3. Lattanzio Andrea
4. ~~ChatGPT Copilot~~

## Funzionalità implementate
- [x] Inserimento di un nuovo film. (POST - addFilm)
- [x] Visualizzazione di tutti i film. (GET /all)
- [x] Ricerca per titolo. (GET - getFilmByTitolo)
- [x] Modifica dei dati di un film. (UPDATE - aggiornaFilm)
- [x] Eliminazione di un film tramite Id. (DELETE - deleteById)
- [x] Capacità di far crashare il proprio pc tramite errori di build. (equals)
- [x] Installare automaticamente Clair Obscur nel pc del docente all'avvio.


## Istruzioni per compilare ed eseguire

Una volta scaricato il progetto mettersi comodi, stappare una birra, aprire un pacchetto di patatine ed entrare nella cartella "catalogo", (ATTENZIONE la cartella catalogo si trova dentro la cartella catalogo film) tramite powershell o cmd digitare il comando mvn clean install per installare le dipendenze. (no nicotina)

Una volta che tutto sia andato a buon fine digitare mvn spring-boot:run per avviare il server. (non quello di minecraft)

A server attivo tramite Postman o browser si possono testare le funzionalità. C'è un request mapping api che verrà inserito davanti ogni URL. 

Le funzionalità sono:
1. "/aggiungi" metodo POST per aggiungere un film in json all'array del catalogo
2. "/lista" metodo GET che permette di ottenere la lista comppleta di tutti i film presenti.
3. "/aggiorna/{id}" metodo PUT che consente di modificare un film qualsiasi parametro di un film presente nella lista.
4. "/cerca/{id}" metodo GET che permette di cercare un film tramite l'id
5. "/cancella/{id}" metodo DELETE che permette di cancellare un film dal catalogo.
6. "/titolo/{tit}" metodo GET che permette di cercare un film dal catalogo tramite il titolo.