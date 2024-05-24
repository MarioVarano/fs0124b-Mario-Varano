package it.epicode.verificaSpring.services;

import it.epicode.verificaSpring.controllers.records.DispositiviRequest;
import it.epicode.verificaSpring.entities.Dipendenti;
import it.epicode.verificaSpring.entities.Dispositivi;
import it.epicode.verificaSpring.enums.StatoDispositivo;
import it.epicode.verificaSpring.repository.DispositiviRepository;
import it.epicode.verificaSpring.services.exceptions.BadRequestException;
import it.epicode.verificaSpring.services.exceptions.DispositivoNonDisponibileException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Slf4j
public class DispositiviService {

    @Autowired
    DispositiviRepository dispositivi;
    @Autowired
    DipendentiService dipendente;


    public Dispositivi save(DispositiviRequest d){
        Dispositivi dispositivo = new Dispositivi(
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


    public Dispositivi update(Long id, DispositiviRequest dispositivo){
        Dispositivi dipes = dispositivi.findById(id).orElseThrow(() -> new RuntimeException("Dispositivo non c'è"));
        dipes.setTipo(dispositivo.tipo());
        dipes.setStato(dispositivo.stato());

        return dispositivi.save(dipes);
    }


    public Dispositivi assegnaDispositivo(Long dipendenteId, Long dispositivoId) {
        Dipendenti dipendenti = dipendente.findById(dipendenteId);
        Dispositivi dispositivo = dispositivi.findById(dispositivoId).orElseThrow();
        if(dispositivo.getStato().equals(StatoDispositivo.DISPONIBILE)){
            dispositivo.setDipendenti(dipendenti);
            dispositivo.setStato(StatoDispositivo.ASSEGNATO);
            dispositivi.save(dispositivo);
        }else{
          throw new DispositivoNonDisponibileException("dispositivo non disponibile: " + dispositivo.getStato());
        }
        return dispositivo;


    }

}
