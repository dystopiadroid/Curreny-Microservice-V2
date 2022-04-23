package com.bala.microservices.currencyconversionservice.controller;

import java.math.BigDecimal;

import com.bala.microservices.currencyconversionservice.bean.CurrencyConversion;
import com.bala.microservices.currencyconversionservice.service.CurrencyConversionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConversionController {

	@Autowired
	private CurrencyConversionService service;

	@GetMapping("/currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversion getCalculatedCurrencyConversionFeign(@PathVariable String from, @PathVariable String to, @PathVariable BigDecimal quantity){

		CurrencyConversion currencyConversion = service.calculateCurrencyConversion(from, to, quantity);
		return currencyConversion;
		
	}

}















