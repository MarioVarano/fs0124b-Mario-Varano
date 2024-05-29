package it.epicode.verificaSpring.services;

import it.epicode.verificaSpring.controllers.records.DipendentiRegisterModel;
import it.epicode.verificaSpring.controllers.records.DipendentiRequest;
import it.epicode.verificaSpring.entities.DTO.DipeRegister;
import it.epicode.verificaSpring.entities.DTO.DipeRegistered;
import it.epicode.verificaSpring.entities.Dipendenti;
import it.epicode.verificaSpring.repository.DipendentiRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@Slf4j
public class DipendentiService {

    @Autowired
    DipendentiRepository dipendenti;

    @Autowired
    Mapper<DipeRegister, Dipendenti> dto2Entity;
    @Autowired
    Mapper<Dipendenti,DipeRegistered> entity2Dto;





    public Dipendenti save(DipendentiRequest d){
        Dipendenti dipendente = new Dipendenti(
                d.username(),
                d.name(),
                d.cognome(),
                d.email(),
                d.password()
        );
        return dipendenti.save(dipendente);
    }


    public Dipendenti findById(Long id){
        var d = dipendenti.findById(id);
        return d.orElseThrow();

    }

    public Dipendenti delete(Long id){
        var c = dipendenti.findById(id);
        dipendenti.deleteById(id);
        return c.orElseThrow();
    }


    public List<Dipendenti> getAll(){
        return dipendenti.findAll();
    }

    public Dipendenti update(Long id, DipendentiRequest dipendente){
        Dipendenti dipe = dipendenti.findById(id).orElseThrow(() -> new RuntimeException("Dipendente non c'è"));
        dipe.setUsername(dipendente.username());
        dipe.setName(dipendente.name());
        dipe.setCognome(dipendente.cognome());
        dipe.setEmail(dipendente.email());


        return dipendenti.save(dipe);

    }

    public Optional<DipeRegistered> register (DipeRegister dipe){
        try{
            var u = dipendenti.save(dto2Entity.map(dipe));
            return Optional.of(DipeRegistered.builder().withEmail(u.getEmail()).withId(u.getId()).withUsername(u.getUsername()).build());

        }catch(Exception e){
            log.error(String.format("Non è stato possibile salvare il Dipe %s", dipe), e);
            throw new RuntimeException();
        }
    }


    public Optional<DipeRegistered> login(String username,String password){
        try{
            var u = dipendenti.findOneByUsernameAndPassword(username, password).orElseThrow();
            return Optional.of(DipeRegistered.builder().withId(u.getId()).withUsername(u.getUsername()).withEmail(u.getEmail()).build());
        }catch (Exception e) {
            log.error("Dipe not found", e);
            throw new RuntimeException();
        }
    }



}
