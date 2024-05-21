package it.epicode.Restful.services;

import it.epicode.Restful.esercizio.entities.Autore;
import it.epicode.Restful.repositories.AutoreRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class AutoreService {

    @Autowired
    private AutoreRepository autore;

//salva
    public Autore save(Autore a){
        return autore.save(a);
    }

    //ritorna tutti gli autori
    public List<Autore> getAll(){return autore.findAll();}


    public Optional<Autore> cercaId(long id){
        return autore.findById(id);
    }


    public void Crea(String nome, String cognome, String email, LocalDate dataDiNascita){
        var autores =  Autore.builder().withNome(nome).withCognome(cognome).withEmail(email).withDataDiNascita(dataDiNascita).build();
        autore.save(autores);
    }





    public Autore updateAuthor(Long id, Autore autoreD) {
       Optional<Autore> Author = autore.findById(id);

        if (Author.isPresent()) {
            Autore existingAuthor = Author.get();
            existingAuthor.setNome(autoreD.getNome());
            existingAuthor.setCognome(autoreD.getCognome());
            existingAuthor.setEmail(autoreD.getEmail());
            existingAuthor.setDataDiNascita(autoreD.getDataDiNascita());
            return autore.save(existingAuthor);
        } else {
            throw new RuntimeException("Author not found with id " + id);
        }
    }


}
