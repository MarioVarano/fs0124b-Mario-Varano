package servizi;

import data.Catalogo;

import java.util.Optional;

public interface Archivio {
    void add(Catalogo c);
    void deleteISBN(Integer ISBN);
    Optional<Catalogo> getByISBN(Integer ISBN);
    void getAnno(int anno);
    void getAutore(String autore);

}
