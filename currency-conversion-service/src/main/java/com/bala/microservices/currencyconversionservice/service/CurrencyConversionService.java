package com.bala.microservices.currencyconversionservice.service;

import java.math.BigDecimal;

import com.bala.microservices.currencyconversionservice.bean.CurrencyConversion;
import com.bala.microservices.currencyconversionservice.configuration.CurrencyExchangeProxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CurrencyConversionService {

	@Autowired
	private CurrencyExchangeProxy proxy;

	public CurrencyConversion calculateCurrencyConversion(String from, String to, BigDecimal quantity){
		CurrencyConversion currencyConversion = proxy.getExchangeValue(from, to);
		BigDecimal conversionMultiple = currencyConversion.getConversionMultiple();
		return new CurrencyConversion(currencyConversion.getId(), from, to, conversionMultiple, quantity, quantity.multiply(conversionMultiple), currencyConversion.getEnvironment() + " from FEIGN");
	}	
	
}
