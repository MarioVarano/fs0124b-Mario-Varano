package it.epicode.Ultimo.config;

import it.epicode.Ultimo.services.RuoliService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Runner implements CommandLineRunner {
    @Autowired
    RuoliService ruolo;


    @Override
    public void run(String... args) throws Exception {

        try {
            ruolo.save(("organizzatore"));
            ruolo.save(("utente"));
        } catch (Exception e) {
            log.error("Impossibile salvare");

        }
    }
}