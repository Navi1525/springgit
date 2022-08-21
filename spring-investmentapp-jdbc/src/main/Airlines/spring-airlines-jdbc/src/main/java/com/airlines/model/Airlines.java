package com.airlines.model;

public class Airlines {
	
	private String source;
	private String destination;
	private double cost;
	private Integer airlineId;
	private String pnrnumber;
	private String type; //economy or business
	
	
	public Airlines() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Airlines(String source, String destination, double cost, Integer airlineId, String pnrnumber, String type) {
		super();
		this.source = source;
		this.destination = destination;
		this.cost = cost;
		this.airlineId = airlineId;
		this.pnrnumber = pnrnumber;
		this.type = type;
	}


	public String getSource() {
		return source;
	}


	public void setSource(String source) {
		this.source = source;
	}


	public String getDestination() {
		return destination;
	}


	public void setDestination(String destination) {
		this.destination = destination;
	}


	public double getCost() {
		return cost;
	}


	public void setCost(double cost) {
		this.cost = cost;
	}


	public Integer getAirlineId() {
		return airlineId;
	}


	public void setAirlineId(Integer airlineId) {
		this.airlineId = airlineId;
	}


	public String getPnrnumber() {
		return pnrnumber;
	}


	public void setPnrnumber(String pnrnumber) {
		this.pnrnumber = pnrnumber;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	@Override
	public String toString() {
		return "Airlines [source=" + source + ", destination=" + destination + ", cost=" + cost + ", airlineId="
				+ airlineId + ", pnrnumber=" + pnrnumber + ", type=" + type + "]";
	}
	
	
	
	
	

}