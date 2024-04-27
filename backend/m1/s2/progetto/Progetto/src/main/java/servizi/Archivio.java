package servizi;

import data.Catalogo;

import java.util.Optional;
//interfaccia per tutti gli attributi che mi servono per le varie funzionalità richieste dall'esercizio
public interface Archivio {
    void add(Catalogo c);
    void deleteISBN(Integer ISBN);
    Optional<Catalogo> getByISBN(Integer ISBN);
    Optional<Catalogo> getAnno(Integer anno);
    void getAutore(String autore);

}
