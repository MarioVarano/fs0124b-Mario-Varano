import Eventi.FileEventoDAO;
import GestioneEventi.Evento;
import GestioneEventi.EventoT;
import jakarta.persistence.Persistence;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        final Logger log = LoggerFactory.getLogger(FileEventoDAO.class);
        final ArrayList<Evento> lista = new ArrayList<>();
        final String PERSISTENCE_UNIT = "postgres";



        Evento evento1 = new Evento(1,"ciao", LocalDate.of(2020,01,01),"bello", EventoT.PRIVATO,10);
        Evento evento2 = new Evento(2,"ciao  a tutti", LocalDate.of(2020,01,01),"bello", EventoT.PRIVATO,10);

        lista.add(evento1);
        lista.add(evento2);
        System.out.println(lista);

        try {
            var emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
            var em = emf.createEntityManager();
            var transazione = em.getTransaction();
            transazione.begin();
            for (Evento c : lista) {
                em.merge(c);
                log.debug("Salvati {}", c);

            }
            transazione.commit();
            em.close();
            emf.close();
        } catch (Exception e) {
            log.error("Hai sbagliato", e);
        }
    }

}
