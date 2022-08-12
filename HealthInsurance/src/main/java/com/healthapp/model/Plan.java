package com.healthapp.model;

public class Plan {

	
	private String planName;
	private String category;
	private String brand;
	private String coverage;
	private double sumInsured;
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCoverage() {
		return coverage;
	}
	public void setCoverage(String coverage) {
		this.coverage = coverage;
	}
	public double getSumInsured() {
		return sumInsured;
	}
	public void setSumInsured(double sumInsured) {
		this.sumInsured = sumInsured;
	}
	@Override
	public String toString() {
		return "Plan [planName=" + planName + ", category=" + category + ", brand=" + brand + ", coverage=" + coverage
				+ ", sumInsured=" + sumInsured + "]";
	}
	
}
