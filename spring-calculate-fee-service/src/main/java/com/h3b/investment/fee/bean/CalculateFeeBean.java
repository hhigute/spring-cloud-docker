package com.h3b.investment.fee.bean;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class CalculateFeeBean {
	
	private int day;
	private double percentFee;
	private BigDecimal initalAmount;
	private BigDecimal calculatedAmount;
	private BigDecimal calculatedFee;
	private int port;
	private String host;
	
	public CalculateFeeBean() {
		
	}
	
	public CalculateFeeBean(int day, double percentFee, BigDecimal initalAmount, BigDecimal calculatedAmount, BigDecimal calculatedFee, int port, String host) {
		super();
		this.day = day;
		this.percentFee = percentFee;
		this.initalAmount = initalAmount;
		this.calculatedAmount = calculatedAmount;
		this.calculatedFee = calculatedFee;
		this.port = port;
		this.host = host;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public double getPercentFee() {
		return percentFee;
	}

	public void setPercentFee(double percentFee) {
		this.percentFee = percentFee;
	}

	public BigDecimal getInitalAmount() {
		return initalAmount;
	}

	public void setInitalAmount(BigDecimal initalAmount) {
		this.initalAmount = initalAmount;
	}

	public BigDecimal getCalculatedAmount() {
		return calculatedAmount;
	}

	public void setCalculatedAmount(BigDecimal calculatedAmount) {
		this.calculatedAmount = calculatedAmount;
	}
	
	public BigDecimal getCalculatedFee() {
		return calculatedFee;
	}

	public void setCalculatedFee(BigDecimal calculatedFee) {
		this.calculatedFee = calculatedFee;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	@Override
	public String toString() {
		return "CalculateFeeBean [day=" + day + ", percentFee=" + percentFee + ", initalAmount=" + initalAmount
				+ ", calculatedAmount=" + calculatedAmount + ", calculatedFee=" + calculatedFee + ", port=" + port
				+ ", host=" + host + "]";
	}

	
	
	
	
	

}
