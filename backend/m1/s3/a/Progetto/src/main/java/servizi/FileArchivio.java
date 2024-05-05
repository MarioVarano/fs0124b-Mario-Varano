package servizi;

import data.Catalogo;
import data.Libri;
import data.Prestito;
import jakarta.persistence.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static jakarta.persistence.Persistence.createEntityManagerFactory;

public class FileArchivio implements Archivio {

    private static final Logger logger = LoggerFactory.getLogger(FileArchivio.class);

    protected EntityManagerFactory emf = createEntityManagerFactory("postgres");

    protected EntityManager em = emf.createEntityManager();



    @Override
    public void add(Catalogo elemento) {

    }

    // Metodo per salvare i cataloghi nel file CSV
    @Override
    public void save(Catalogo cat) {
        var t = em.getTransaction();
        t.begin();
        em.persist(cat);
        t.commit();


    }

    // Rimuovo un catalogo in base all'ISBN
    @Override
        public void deleteISBN(Integer ISBN) {
            try {
                Catalogo catalogo = em.find(Catalogo.class, ISBN);

                if (catalogo != null) {
                    var t = em.getTransaction();
                    t.begin();
                    em.remove(catalogo);
                    t.commit();
                    logger.info("Catalogo con ISBN {} rimosso con successo", ISBN);
                } else {
                    logger.warn("Nessun catalogo trovato con ISBN {}", ISBN);
                }
            } catch (Exception e) {
                logger.error("Errore durante la rimozione del catalogo con ISBN {}", ISBN, e);
            }
        }





    @Override
    public List<Catalogo> getAnno(Integer AnnoPubblicazione) {
        try {
            var query = em.createNamedQuery("GET_BY_ANNO");
            query.setParameter("AnnoPubblicazione", AnnoPubblicazione);
            List<Catalogo> result = query.getResultList();
            return result;
        } catch (Exception e) {
            logger.error("Nessun libro uscito in questo anno nel catalogo", e);
            return null;
        }
    }

    @Override
    public List<Catalogo> getAutore(String autore) {
        return List.of();
    }

    @Override
    public Catalogo getByTitolo(String titolo) {
        return null;
    }

    @Override
    public List<Catalogo> getElementiInPrestito(Integer numeroTessera) {
        return List.of();
    }

    @Override
    public List<Prestito> getPrestitiScadutiNonRestituiti() {
        return List.of();
    }

    @Override
    public Optional<Catalogo> getISBN(Integer ISBN) {
        return Optional.empty();
    }


    public Catalogo getByISBN(Integer isbn) {
        try {
            return em.createQuery("SELECT i FROM Catalogo i WHERE i.ISBN = :ISBN", Catalogo.class)
                    .setParameter("ISBN", isbn)
                    .getSingleResult();
        } catch (NoResultException e) {
            return null;
        } catch (Exception e) {
            System.out.println("Si è verificato un errore durante la ricerca per ISBN.");
            return null;
        }
    }

    public Catalogo getByAnno(Integer anno) {
        try {
            return em.createQuery("SELECT i FROM Catalogo i WHERE i.annoPubblicazione = :annoPubblicazione", Catalogo.class)
                    .setParameter("annoPubblicazione", anno)
                    .getSingleResult();
        } catch (NoResultException e) {
            return null;
        } catch (Exception e) {
            System.out.println("Si è verificato un errore durante la ricerca per anno.");
            return null;
        }
    }

    public Libri getByAutore(String autore) {
        try {
            return em.createQuery("SELECT i FROM Catalogo i WHERE i.autore = :autore", Libri.class)
                    .setParameter("autore", autore)
                    .getSingleResult();
        } catch (NoResultException e) {
            return null;
        } catch (Exception e) {
            System.out.println("Si è verificato un errore durante la ricerca per autore.");
            return null;
        }
    }
    public List<Libri> getByTitoloPart(String titolo) {
        try {
            return em.createQuery("SELECT l FROM Libri l WHERE l.titolo LIKE CONCAT('%', :titolo, '%')", Libri.class)
                    .setParameter("titolo", titolo)
                    .getResultList();
        } catch (Exception e) {
            System.out.println("Si è verificato un errore durante la ricerca per titolo.");
            return Collections.emptyList();
        }
    }



}