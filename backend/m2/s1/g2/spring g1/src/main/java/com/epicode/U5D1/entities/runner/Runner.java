package com.epicode.U5D1.entities.runner;

import com.epicode.U5D1.entities.AppConfig;
import com.epicode.U5D1.entities.Ordine;
import com.epicode.U5D1.entities.Tavolo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
@Slf4j
public class Runner implements CommandLineRunner {

    @Autowired
    AppConfig appConfig;

    @Autowired
    @Qualifier("ordine1")
    Ordine ordine;




    @Override
    public void run(String... args) throws Exception {
        var tavolo = new Tavolo(1,2,false,appConfig.ordine1());
        log.info("{}",tavolo);


    }
}
