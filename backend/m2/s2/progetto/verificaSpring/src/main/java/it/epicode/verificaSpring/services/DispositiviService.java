package it.epicode.verificaSpring.services;

import it.epicode.verificaSpring.controllers.records.DispositiviRequest;
import it.epicode.verificaSpring.entities.Dispositivi;
import it.epicode.verificaSpring.repository.DispositiviRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Slf4j
public class DispositiviService {

    @Autowired
    DispositiviRepository dispositivi;


    public Dispositivi save(DispositiviRequest d){
        Dispositivi dispositivo = new Dispositivi(
                d.dipendente(),
                d.tipo(),
                d.stato()
        );
        return dispositivi.save(dispositivo);
    }

    public Dispositivi findById(Long id){
        var d = dispositivi.findById(id);
        return d.orElseThrow();
    }


    public Dispositivi delete (Long id){
        var c = dispositivi.findById(id);
        dispositivi.deleteById(id);
        return c.orElseThrow();
    }


    public List<Dispositivi> getAll(){
        return dispositivi.findAll();
    }



}
