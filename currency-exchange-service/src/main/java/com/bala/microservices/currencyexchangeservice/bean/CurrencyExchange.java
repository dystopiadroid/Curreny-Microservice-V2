package com.bala.microservices.currencyexchangeservice.bean;

import java.math.BigDecimal;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class CurrencyExchange {

	@Id
	private String id;

	private String from;

	private String to;

	private BigDecimal conversionMultiple;
	private String environment;

	public CurrencyExchange(){

	}

	public CurrencyExchange(String from, String to, BigDecimal conversionMultiple) {
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}

	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}
	
}
