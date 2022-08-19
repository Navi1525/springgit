package com.investmentapp.modal;

public enum PlanType {
	
	mutual("MutualFund"),
	ppf("Public Provident Fund"),
	ulip("unit limited investment plan"),
	senior("senior pension scheme"),
	fd("fixed deposit");
	
	public String type;

	private PlanType(String type) {
		this.type = type;
	}
	 
	
	
}
