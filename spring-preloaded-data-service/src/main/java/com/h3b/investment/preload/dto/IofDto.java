package com.h3b.investment.preload.dto;

import java.io.Serializable;

public class IofDto  implements Serializable {

    private static final long serialVersionUID = 4865903039190150223L;
	private int nrDay;
	private double percentFee;
	private int port;
	private String host;
	
	
	public int getNrDay() {
		return nrDay;
	}
	public void setNrDay(int nrDay) {
		this.nrDay = nrDay;
	}
	public double getPercentFee() {
		return percentFee;
	}
	public void setPercentFee(double percentFee) {
		this.percentFee = percentFee;
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
		return "IofDto [nrDay=" + nrDay + ", percentFee=" + percentFee + ", port=" + port + ", host=" + host + "]";
	}
	
	

}
