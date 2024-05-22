package it.epicode.springweb.services;

import it.epicode.springweb.entities.Autore;
import it.epicode.springweb.repository.AutoriRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;


@Service
@Slf4j
public class AutoreService implements AutoreServiceInterface{

    @Autowired
    private AutoriRepository autoriDao;


    @Override
    public List<Autore> getAutori() {
        return autoriDao.findAll();
    }

    @Override
    public Optional<Autore> getAutoreById(Long Id) {
        return autoriDao.findById(Id);
    }

    @Override
    public Autore save(Autore autore) {
        return autoriDao.save(autore);
    }

    @Override
    public void Update(Long autoreId, Autore body) throws Exception {
        var cercaAutore = autoriDao.findById(autoreId);
        if (cercaAutore.isPresent()){
            Autore autore = cercaAutore.get();
            if (body.getNome() != null) autore.setNome(body.getNome());
            if (body.getCognome() != null) autore.setCognome(body.getCognome());
            if (body.getEmail() != null) autore.setEmail(body.getEmail());
            if (body.getDataDiNascita() != null) autore.setDataDiNascita(body.getDataDiNascita());
            if (body.getAvatar() != null) autore.setAvatar(body.getAvatar());
            autoriDao.save(autore);
        } else throw new Exception();
    }

    @Override
    public Autore delete(Long autoreId) {
        try{
            var autore = autoriDao.findById(autoreId).orElseThrow();
            autoriDao.delete(autore);
            return autore;
        }catch(NoSuchElementException e){
            log.error(String.format("Non trovo autore con questo id = %s", autoreId), e);
            throw new RuntimeException("Non c'è");
        }
    }


    public Autore Crea(String nome, String cognome, String email, String dataDiNascita){
        var autore =  Autore.builder().withNome(nome).withCognome(cognome).withEmail(email).withDataDiNascita(dataDiNascita).build();
        autoriDao.save(autore);
        return autore;
    }
}
