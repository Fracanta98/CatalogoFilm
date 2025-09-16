package com.example.CatalogoFilm;



public class Film{
   private int id; 
   private String titolo;
   private String regista; 
   private int anno; 
   private String genere; 


        public Film(){} //costruttore vuoto


        public Film(int id, String titolo, String regista, int anno, String genere){
            this.id = id;
            this.titolo = titolo;
            this.regista = regista;
            this.anno = anno;
            this.genere = genere; 
        }

        //GETTERS
        public int getId(){return id;}
        public String getTitolo(){return titolo;}
        public String getRegista(){return regista;}
        public int getAnno(){return anno;}
        public String getGenere(){return genere;}

        //SETTERS
        public void setId(int nuovoID){this.id = nuovoID;}
        public void setTitolo(String nuovoTitolo){this.titolo = nuovoTitolo;}
        public void setRegista(String nuovoRegista){this.regista = nuovoRegista;}
        public void setAnno(int nuovoAnno){this.anno = nuovoAnno;}
        public void setGenere(String nuovoGenere){this.genere = nuovoGenere;}


        @Override
        public String toString() {  //Java applica di base il toString quindi bisogna sovrascriverlo per poter visualizzare il
             return "Film{" +       //dati a proprio piacimento, al posto dell'hash code della posizione di memoria
                    "id: " + id +
                    ", titolo: '" + titolo + '\'' +
                    ", regista: '" + regista + '\'' +
                    ", anno: " + anno +
                    ", genere: '" + genere + '\'' +
                    '}';
    }

}