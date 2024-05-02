package GestioneEventi;

import jakarta.persistence.*;

@Entity
@Table(name = "partecipazione")
public class Partecipazione {
    @Id
    @Column(length = 20, nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @ManyToOne
    @JoinColumn(name = "persona_id")
    @Column(nullable = false)
    private Persona persona;
    @Column(nullable = false)
    @ManyToOne
    @JoinColumn(name = "evento_id")
    private Evento evento;
    @Column(nullable = false)
    private Stato stato;

    public Partecipazione() {

    }

    public Partecipazione(Persona persona, Evento evento, Stato stato) {
        this.persona = persona;
        this.evento = evento;
        this.stato = stato;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public Stato getStato() {
        return stato;
    }

    public void setStato(Stato stato) {
        this.stato = stato;
    }

    @Override
    public String toString() {
        return String.format("Partecipazione[persona=%s, evento=%s, stato=%s]", persona, evento,stato);
    }
}
