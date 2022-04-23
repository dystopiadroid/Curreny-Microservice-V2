package com.bala.microservices.currencyexchangeservice.service;

import com.bala.microservices.currencyexchangeservice.bean.CurrencyExchange;
import com.bala.microservices.currencyexchangeservice.repository.CurrencyExchangeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class CurrencyExchangeService {

	@Autowired
	private CurrencyExchangeRepository currencyexchangerepository;

	@Autowired
	private Environment environment;

	public CurrencyExchange retrieveExchangeValue(String from, String to){
		CurrencyExchange currencyExchange = currencyexchangerepository.findByFromAndTo(from, to);
		if(currencyExchange == null){
			throw new RuntimeException("Unable to find data for " + from + " to " + to);
		}
		currencyExchange.setEnvironment(environment.getProperty("local.server.port"));
		return currencyExchange;
	}
	
}
