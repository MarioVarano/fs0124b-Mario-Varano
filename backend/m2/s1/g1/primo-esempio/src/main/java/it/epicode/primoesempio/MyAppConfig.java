package it.epicode.primoesempio;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class MyAppConfig {

    @Bean(name = "pizza")
    Pizza getPizza() {
        return new Pizza();
    }


    @Bean(name= "toppings")
    Toppings getToppings(){
        return new Toppings();
    }
    @Bean(name= "drinks")
    Drinks getDrinks(){
        return new Drinks();
    }
}
