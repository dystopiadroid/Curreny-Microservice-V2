package com.bala.microservices.currencyexchangeservice.repository;

import com.bala.microservices.currencyexchangeservice.bean.CurrencyExchange;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrencyExchangeRepository extends MongoRepository<CurrencyExchange, Long>{

	CurrencyExchange findByFromAndTo(String from, String to);
	
}
