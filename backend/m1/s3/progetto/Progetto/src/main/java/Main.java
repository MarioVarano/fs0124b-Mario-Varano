import data.Catalogo;
import data.Libri;
import data.Periodicita;
import data.Riviste;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import servizi.FileArchivio;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Catalogo> c = new ArrayList<>();

        Libri libro1 = new Libri(1,"ciao",1989,54,"io","bello");
        c.add(libro1);

        FileArchivio archivio = new FileArchivio();

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgres");
        EntityManager  em = emf.createEntityManager();

        EntityTransaction t =em.getTransaction();
        t.begin();
        archivio.add(c);
        t.commit();
    }
}
