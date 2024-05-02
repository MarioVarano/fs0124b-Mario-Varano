package GestioneEventi;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "persone")
public class Persona {

@Id
@Column(length = 20, nullable = false)
@GeneratedValue(strategy = GenerationType.AUTO)
private long id;
@Column(nullable = false)
private String nome;
@Column(nullable = false)
private String cognome;
@Column(nullable = false)
private String email;
@Column (nullable = false)
private LocalDate dataDiNascita;
@Column(nullable = false)
private Sesso sesso;
@Column(nullable = false)
@OneToMany(mappedBy = "persona" )
private List<Partecipazione> listaPartecipazioni = new ArrayList<>();

    public Persona() {
    }

    public Persona(String nome, String cognome, String email, LocalDate dataDiNascita, Sesso sesso, List<Partecipazione> listaPartecipazioni) {
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.dataDiNascita = dataDiNascita;
        this.sesso = sesso;
        this.listaPartecipazioni = listaPartecipazioni;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataDiNascita() {
        return dataDiNascita;
    }

    public void setDataDiNascita(LocalDate dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }

    public Sesso getSesso() {
        return sesso;
    }

    public void setSesso(Sesso sesso) {
        this.sesso = sesso;
    }

    public List<Partecipazione> getListaPartecipazioni() {
        return listaPartecipazioni;
    }

    public void setListaPartecipazioni(List<Partecipazione> listaPartecipazioni) {
        this.listaPartecipazioni = listaPartecipazioni;
    }

    @Override
    public String toString() {
        return String.format("Person[nome=%s, cognome=%s, email=%s, dataDiNascita=%s, sesso=%s, listaPartecipazioni=%s]", nome,
                cognome, email, dataDiNascita, sesso, listaPartecipazioni);
    }


}
