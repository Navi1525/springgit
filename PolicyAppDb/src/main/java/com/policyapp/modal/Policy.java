package com.policyapp.modal;

public class Policy {

	private String policyname;
	private Integer policyId;
	private double premium;
	private String type;
	private int duration;
	private String coverage;
	private String category;
	private String brand;
	private double sumAssured;
	public Policy() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Policy(String policyname, Integer policyId, double premium, String type, int duration, String coverage,
			String category, String brand, double sumAssured) {
		super();
		this.policyname = policyname;
		this.policyId = policyId;
		this.premium = premium;
		this.type = type;
		this.duration = duration;
		this.coverage = coverage;
		this.category = category;
		this.brand = brand;
		this.sumAssured = sumAssured;
	}
	public String getPolicyname() {
		return policyname;
	}
	public void setPolicyname(String policyname) {
		this.policyname = policyname;
	}
	public Integer getPolicyId() {
		return policyId;
	}
	public void setPolicyId(Integer policyId) {
		this.policyId = policyId;
	}
	public double getPremium() {
		return premium;
	}
	public void setPremium(double premium) {
		this.premium = premium;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getCoverage() {
		return coverage;
	}
	public void setCoverage(String coverage) {
		this.coverage = coverage;
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
	public double getSumAssured() {
		return sumAssured;
	}
	public void setSumAssured(double sumAssured) {
		this.sumAssured = sumAssured;
	}
	@Override
	public String toString() {
		return "Policy [policyname=" + policyname + ", policyId=" + policyId + ", premium=" + premium + ", type=" + type
				+ ", duration=" + duration + ", coverage=" + coverage + ", category=" + category + ", brand=" + brand
				+ ", sumAssured=" + sumAssured + "]";
	}

	

}