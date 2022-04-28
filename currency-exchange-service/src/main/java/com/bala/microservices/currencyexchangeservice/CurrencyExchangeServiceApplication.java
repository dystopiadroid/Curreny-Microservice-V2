package com.bala.microservices.currencyexchangeservice;

import java.math.BigDecimal;

import com.bala.microservices.currencyexchangeservice.bean.CurrencyExchange;
import com.bala.microservices.currencyexchangeservice.repository.CurrencyExchangeRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CurrencyExchangeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyExchangeServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(CurrencyExchangeRepository repository){
		return args -> {
			CurrencyExchange exchange1 = new CurrencyExchange("USD", "INR", BigDecimal.valueOf(76.67));
			CurrencyExchange exchange2 = new CurrencyExchange("EUR", "INR", BigDecimal.valueOf(80.51));
			CurrencyExchange exchange3 = new CurrencyExchange("GBP", "INR", BigDecimal.valueOf(95.59));
			repository.insert(exchange1);
			repository.insert(exchange2);
			repository.insert(exchange3);
		};
	}

}
