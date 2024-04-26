package servizi;

import data.Catalogo;
import data.Libri;
import data.Riviste;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;



public class FileArchivio implements Archivio {
    private static final Logger logger = LoggerFactory.getLogger(FileArchivio.class);

    private final ArrayList<Catalogo> lista = new ArrayList<>();
    private static final String STORAGE = "./catalogo.csv";

    public void save(){
        File f = new File(STORAGE);
        lista.stream().forEach(c -> {
            try{
                if(c instanceof Libri){
                    var lines = Arrays.asList(c.getISBN().toString(), c.getTitolo(),c.getAnnoPubblicazione(),c.getNumeroPagine(), ((Libri) c).getAutore(), ((Libri) c).getGenere());
                    FileUtils.writeLines(f, StandardCharsets.ISO_8859_1.name(), lines,true);

                }else{
                    var lines = Arrays.asList(c.getISBN().toString(), c.getTitolo(),c.getAnnoPubblicazione(),c.getNumeroPagine(),((Riviste) c).getPeriodicità());
                    FileUtils.writeLines(f, StandardCharsets.ISO_8859_1.name(), lines, true);
                }

            }catch (IOException e){
                logger.error("Eccezione:", e);
            }
        });
    }


    @Override
    public void add(Catalogo c) {
        this.lista.add(c);
        this.save();
    }

    @Override
    public void deleteISBN(Integer ISBN) {
        lista.removeIf(el -> el.getISBN().equals(ISBN));
        this.save();

    }



    @Override
    public Optional<Catalogo> getByISBN(Integer ISBN) {
        var catalogo = this.lista.stream().filter(el -> el.getISBN().equals(ISBN))
                .findFirst();
        return catalogo;
    }

    @Override
    public Optional<Catalogo> getAnno(Integer anno) {
        return Optional.empty();
    }

    @Override
    public void getAutore(String autore) {

    }


    public Optional<Catalogo> getByAutore(String autore) {
        var autoreL = this.lista.stream().filter((el) -> el instanceof Libri && ((Libri) el).getAutore().equals(autore))
                .findFirst();
        return autoreL;
    }


    public Optional<Catalogo> getByAnno(Integer anno) {
        var annoP = this.lista.stream().filter(el -> el.getAnnoPubblicazione().equals(anno))
                .findFirst();
        return annoP;
    }




    public ArrayList<Catalogo> getLista() {
        return lista;
    }


}
