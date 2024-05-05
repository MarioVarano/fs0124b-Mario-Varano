package servizi;

import data.Catalogo;
import data.Libri;
import data.Prestito;

import java.util.List;
import java.util.Optional;

//interfaccia per tutti gli attributi che mi servono per le varie funzionalità richieste dall'esercizio
public interface Archivio {
   public void add(Catalogo elemento);


    // Metodo per salvare i cataloghi nel file CSV
    void save(Catalogo cat);

    void deleteISBN(Integer ISBN);
    Catalogo getByISBN(Integer ISBN);

    Libri getByAutore(String autore);

    List<Catalogo> getAnno(Integer anno);
    List<Catalogo> getAutore(String autore);

    Catalogo getByTitolo(String titolo);

    List<Catalogo> getElementiInPrestito(Integer numeroTessera);

    List<Prestito> getPrestitiScadutiNonRestituiti();

    Optional<Catalogo> getISBN(Integer ISBN);
}
