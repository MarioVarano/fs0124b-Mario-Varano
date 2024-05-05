package servizi;

import data.Catalogo;
import data.Libri;
import data.Periodicita;
import data.Riviste;
import jakarta.persistence.EntityManager;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.lang.Integer.parseInt;


public class FileArchivio implements Archivio {
    private static final Logger logger = LoggerFactory.getLogger(FileArchivio.class);
    private EntityManager entityManager;

    @Override
    public void add(List<Catalogo> c) {
        for(Catalogo el: c){
            entityManager.persist(el);
        }
    }

    @Override
    public void deleteISBN(Integer ISBN) {
        Catalogo elimina = entityManager.find(Catalogo.class, ISBN);
        if (elimina != null){
            entityManager.remove(elimina);
        }
    }

    @Override
    public Catalogo getByISBN(Integer ISBN) {
        return entityManager.find(Catalogo.class, ISBN);

    }

    @Override
    public List<Catalogo> getAnno(Integer anno) {
        return entityManager.createNamedQuery("trova_per_anno", Catalogo.class)
                .setParameter("codice", anno)
                .getResultList();
    }

    @Override
    public void getAutore(String autore) {

    }
//lista in cui faccio il load del file.csv




}
