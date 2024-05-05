package servizi;

import data.Catalogo;

import java.util.List;
import java.util.Optional;
//interfaccia per tutti gli attributi che mi servono per le varie funzionalità richieste dall'esercizio
public interface Archivio {
    void add(List<Catalogo> c);
    void deleteISBN(Integer ISBN);
    Catalogo getByISBN(Integer ISBN);
    List<Catalogo> getAnno(Integer anno);
    void getAutore(String autore);

}
