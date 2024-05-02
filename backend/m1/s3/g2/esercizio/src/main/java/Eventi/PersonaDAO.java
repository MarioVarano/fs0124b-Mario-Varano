package Eventi;

import GestioneEventi.Persona;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class PersonaDAO implements EventoDAO{
    private EntityManager em;

    public PersonaDAO(EntityManager em) {
        this.em = em;
    }


    public void save(Persona p) {
        try{
            EntityTransaction t = em.getTransaction();
            t.begin();
            em.persist(p);
            t.commit();
            System.out.println(p.getNome() +" "+"creato");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    @Override
    public void save() {

    }

    @Override
    public void getById() {

    }

    @Override
    public void delete() {

    }


    public Persona findById(long id) {
        return em.find(Persona.class, id);
    }


    public void delete(long id) {
        try{
            EntityTransaction t = em.getTransaction();
            t.begin();
            Persona trova = em.find(Persona.class, id);
            if (trova != null){
                em.remove(trova);
                t.commit();
                System.out.println("eliminato");
            }else System.out.println("non trovata ");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
