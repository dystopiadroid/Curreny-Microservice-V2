package com.bala.microservices.limitsservice.bean;

public class Limits {

	public Limits(){

	}

	public Limits(int min, int max) {
		this.min = min;
		this.max = max;
	}

	private int min;
	private int max;

	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}

}
