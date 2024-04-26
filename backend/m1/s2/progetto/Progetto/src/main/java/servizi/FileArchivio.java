package servizi;

import data.Catalogo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;


public class FileArchivio implements Archivio {
    private static final Logger logger = LoggerFactory.getLogger(FileArchivio.class);

    private final ArrayList<Catalogo> lista = new ArrayList<>();
    private static final String STORAGE = "./catalogo.my";



    @Override
    public void add(Catalogo c) {
        this.lista.add(c);
    }

    @Override
    public void deleteISBN(Integer ISBN) {
        lista.removeIf(el -> el.getISBN().equals(ISBN));

    }



    @Override
    public Optional<Catalogo> getByISBN(Integer ISBN) {
        var catalogo = this.lista.stream().filter(el -> el.getISBN().equals(ISBN))
                .findFirst();
        System.out.println(catalogo);

        return catalogo;
    }

    @Override
    public void getAnno(int anno) {

    }

    @Override
    public void getAutore(String autore) {

    }

    public ArrayList<Catalogo> getLista() {
        return lista;
    }
}
