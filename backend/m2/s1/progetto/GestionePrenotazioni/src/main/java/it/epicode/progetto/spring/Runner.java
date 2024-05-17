package it.epicode.progetto.spring;

import it.epicode.progetto.spring.entities.AppConfig;
import it.epicode.progetto.spring.service.EdificioService;
import it.epicode.progetto.spring.service.PostazioneService;
import it.epicode.progetto.spring.service.PrenotazioneService;
import it.epicode.progetto.spring.service.UtenteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Runner implements CommandLineRunner {
    @Autowired
    private UtenteService utenteService;
    @Autowired
    private PrenotazioneService prenotazioneService;
    @Autowired
    PostazioneService postazioneService;
    @Autowired
    EdificioService edificioService;

    @Autowired
    AppConfig appConfig;



    @Override
    public void run(String... args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
    try{
        utenteService.save(appConfig.marioBean());
        utenteService.save(appConfig.lucaBean());
        edificioService.save(appConfig.edificioMeiBean());
        edificioService.save(appConfig.villaMaestroBean());
        postazioneService.save(appConfig.postazione1Bean());
        postazioneService.save(appConfig.postazione2Bean());
    }catch (Exception ex) {
        System.err.println(ex.getMessage());
    }




    }
}
