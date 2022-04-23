package com.bala.microservices.currencyexchangeservice.controller;

import com.bala.microservices.currencyexchangeservice.bean.CurrencyExchange;
import com.bala.microservices.currencyexchangeservice.service.CurrencyExchangeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {

	@Autowired
	private CurrencyExchangeService currencyexchangeservice;

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyExchange getExchangeValue(@PathVariable String from, @PathVariable String to){
		CurrencyExchange currencyExchange = currencyexchangeservice.retrieveExchangeValue(from, to);
		return currencyExchange;
	}
	
}
