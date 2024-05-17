package it.epicode.progetto.spring.entities;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {


    @Bean(name="Mario")
    public Utente marioBean(){
        return Utente.builder()
                .withUsername("Mariuzz")
                .withNome("Mario")
                .withCognome("Mio")
                .withEmail("mario@live.it")
                .build();
    }

    @Bean(name = "Luca")
    public Utente lucaBean(){
        return  Utente.builder()
                .withUsername("Farfalla")
                .withNome("Luca")
                .withCognome("Dipe")
                .withEmail("luca@gmail.it")
                .build();
    }

    @Bean(name="AppartaMei")
    public Edificio edificioMeiBean(){
        return Edificio.builder()
                .withName("AppartaMei")
                .withCitta("Milano")
                .withIndirizzo("casa di Mei")
                .build();
    }

    @Bean(name = "VillaMaestro")
    public Edificio villaMaestroBean(){
        return Edificio.builder()
                .withName("VillaMaestro")
                .withCitta("Roma")
                .withIndirizzo("casa del Maestro")
                .build();
    }

    @Bean(name = "Postazione1")
    public Postazioni postazione1Bean(){
        return Postazioni.builder()
                .withDescrizione("bella")
                .withTipo(TipoPostazione.OPENSPACE)
                .withOccupantiMax(1)
                .withEdificio(villaMaestroBean())
                .build();
    }

    @Bean(name = "Postazione2")
    public Postazioni postazione2Bean(){
        return Postazioni.builder()
                .withOccupantiMax(2)
                .withTipo(TipoPostazione.RIUNIONE)
                .withDescrizione("leggendaria")
                .withEdificio(edificioMeiBean())
                .build();
    }




}
