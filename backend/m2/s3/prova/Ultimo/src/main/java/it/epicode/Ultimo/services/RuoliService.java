package it.epicode.Ultimo.services;

import it.epicode.Ultimo.entities.Ruoli;
import it.epicode.Ultimo.repositories.RuoliRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class RuoliService {
    @Autowired
    RuoliRepository ruoli;


    public Ruoli save(String name){
        Ruoli r = new Ruoli();
        r.setNome(name);
        ruoli.save(r);
        return r;
    }
}
