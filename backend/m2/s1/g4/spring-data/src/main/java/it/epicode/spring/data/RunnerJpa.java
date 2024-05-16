package it.epicode.spring.data;

import it.epicode.spring.data.entities.AppConfig;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import it.epicode.spring.data.repository.DrinkRepository;
import it.epicode.spring.data.repository.PizzaRepository;
import it.epicode.spring.data.repository.ToppingRepository;

@Component
@Slf4j
public class RunnerJpa implements CommandLineRunner {

     @Autowired
     AppConfig appConfig;
     @Autowired
    PizzaRepository pizza;
     @Autowired
    DrinkRepository drink;
     @Autowired
    ToppingRepository topping;




    @Override
    public void run(String... args) throws Exception {
        var pizzaS = pizza.saveAll(appConfig.pizzaList());
        var drinkS = drink.saveAll(appConfig.drinksList());
        var toppingS = topping.saveAll(appConfig.toppingsList());
        log.info("tutte le pizza");
        pizza.findAll().forEach(p -> log.info("{}", p));
        drink.findAll().forEach(d -> log.info("{}", d));
        topping.findAll().forEach(t -> log.info("{}", t));

    }
}
