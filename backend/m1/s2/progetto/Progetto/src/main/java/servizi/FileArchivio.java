package servizi;

import data.Catalogo;
import data.Libri;
import data.Periodicita;
import data.Riviste;
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
//lista in cui faccio il load del file.csv
    private  ArrayList<Catalogo> loadLista = new ArrayList<>();
//lista che uso per popolare il file.csv
    private final ArrayList<Catalogo> lista = new ArrayList<>();
//creazione file
    private File f = new File("./catalogo.csv");


//metodo che si occupa della cancellazione e scrittura nel file
    public void save(){
        try{
            FileUtils.delete(f);
        } catch (IOException err) {
            IOException e = err;
            logger.error("Eccezione durante l'eliminazione",e);
        }
        lista.stream().forEach(c -> {
            try{
                //in base al tipo di oggetto utilizzo i suoi attributi(Libri ha 2 parametri in più di catalogo ma diversi da riviste)
                if(c instanceof Libri){
                    var lines = Arrays.asList(c.getISBN().toString()+ "," + c.getTitolo()+ "," + c.getAnnoPubblicazione()+ ","+ c.getNumeroPagine()+ ","+ ((Libri) c).getAutore() + "," + ((Libri) c).getGenere());
                    FileUtils.writeLines(f, StandardCharsets.ISO_8859_1.name(), lines,true);

                }else{
                    //riviste ha un attributo in più di Catalogo ma diverso da Libri
                    var lines = Arrays.asList(c.getISBN().toString() + "," + c.getTitolo()+ "," + c.getAnnoPubblicazione()+ ","+ c.getNumeroPagine()+ ","+((Riviste) c).getPeriodicità());
                    FileUtils.writeLines(f, StandardCharsets.ISO_8859_1.name(), lines, true);
                }

            }catch (IOException e){
                logger.error("Eccezione:", e);
            }
        });
    }
//funzione per il caricamento del file nella nuova lista
    public void load(){
        List<String> l = leggiFile(f);
        System.out.println(loadLista);


    }


//aggiungo elemento alla lista
    @Override
    public void add(Catalogo c) {
        this.lista.add(c);
        this.save();
    }
//elimino elemento in base al suo ISBN
    @Override
    public void deleteISBN(Integer ISBN) {
        lista.removeIf(el -> el.getISBN().equals(ISBN));
        this.save();

    }


//cerco elemento in base al suo ISBN
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

//cerco elemento per autore
    public List<Catalogo> getByAutore(String autore) {
        var autoreL = this.lista.stream().filter((el) -> el instanceof Libri && ((Libri) el).getAutore().equals(autore))
                .toList();
        return autoreL;
    }

    //restituisce lista con tutti gli elementi di anno che passo come parametro al metodo
    public List<Catalogo> getByAnno(Integer anno) {
        var annoP = this.lista.stream().filter(el -> el.getAnnoPubblicazione().equals(anno))
                .toList();
        return annoP;
    }



    //restituisco lista intera
    public ArrayList<Catalogo> getLista() {
        return lista;
    }

//metodo per la lettura dal file e la scrittura nella lista in base al tipo di oggetto che ci trovo all'interno
    //faccio differenza degli oggetti in base alla loro length (Libri == 6)
    public List<String> leggiFile(File file) {
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] el = line.split(",");
                String titolo = el[1];
                String annoPubblicazioneStr = el[2];
                String numeroPagineStr = el[3];
                int annoPubblicazione;
                int numeroPagine;
                try {
                    annoPubblicazione = Integer.parseInt(annoPubblicazioneStr);
                    numeroPagine = Integer.parseInt(numeroPagineStr);
                } catch (NumberFormatException e) {
                    System.err.println("Errore di conversione: " + e.getMessage());
                    continue;
                }
                if (el.length == 5) {
                    String periodicitàStr = el[4];
                    Periodicita periodicità  = Periodicita.valueOf(periodicitàStr);
                    var rivista = new Riviste(titolo, annoPubblicazione, numeroPagine, periodicità);
                    lista.add(rivista);
                } else if (el.length == 6) {
                    String autore = el[4];
                    String genere = el[5];
                    var libro = new Libri(titolo, annoPubblicazione, numeroPagine, autore, genere);
                    lista.add(libro);
                }
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }



}
