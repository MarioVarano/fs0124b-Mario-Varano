package it.epicode.primoesempio;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
@Slf4j
public class PrimoEsempioApplication {

	public static void main(String[] args) {

		SpringApplication.run(PrimoEsempioApplication.class, args);


		try (var ctx = new AnnotationConfigApplicationContext(MyAppConfig.class)) {
			var pizza1 = (Pizza) ctx.getBean("pizza");
			pizza1.Setta(10,1000,"Mario");
			var top = (Toppings) ctx.getBean("toppings");
			top.SettaT(10,50,"funghi");
			pizza1.PizzaSpeciale(top, "Ai funghi");
			var cola = (Drinks) ctx.getBean("drinks");
			cola.SettaD(52,89,"cola");
			System.out.println(pizza1);
			System.out.println(top);
			System.out.println(cola);
		}catch (BeansException e) {
			e.printStackTrace();
		}
	}

}
