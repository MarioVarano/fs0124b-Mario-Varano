package com.epicode.U5D2;

import com.epicode.U5D2.entities.Drink;
import com.epicode.U5D2.entities.Order;
import com.epicode.U5D2.entities.Pizza;
import com.epicode.U5D2.entities.Table;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class Esercizio30102023ApplicationTests {

	Order ordine;

	@Autowired
	@Qualifier("Tavolo3")
	Table tavolo;

	@Autowired
	@Qualifier( "salami_pizza")
	Pizza pizza;


	@Autowired
	@Qualifier("wine")
	Drink vino;


	@BeforeEach
	void inizializzaOrdine() {
		log.info("BeforeEach");
		ordine = new Order(3,tavolo);
		ordine.addItem(pizza);
		ordine.addItem(vino);
	}


	@AfterEach
	void afterEach() {
		log.info("AfterEach");
	}


	@Test
	@DisplayName("Ci sono ordini?")
	void ordiniTest(){
		log.info("prova");
		assertNotNull(ordine,"c'è");
		log.info("eccolo " +  ordine);
	}

	@Test
	@DisplayName("totale")
	void totaleTest(){
		log.info("prova2");
		assertEquals(19.47,ordine.getTotal());
		log.info("eccolo2 " + ordine.getTotal());
	}

	@Test
	@DisplayName("lunghezza lista")
	void lenLista(){
		log.info("prova3");
		assertEquals(2,ordine.getOrderedProducts().size());
		log.info("eccolo3 " + ordine.getOrderedProducts().size());
	}



}
