package com.investmentapp.service;

import java.util.List;

import com.investmentapp.modal.Investment;

public interface IInvestmentService {
	
	void addInvestment(Investment investment);
	void updateInvestment (int planId,double amount);
	void deleteInvestment(int planId);
	
	List<Investment>getByRiskAndTerm(String risk,int term);
	List<Investment>getByType(String type);
	List<Investment>getByPurpose(String type);
	List<Investment>getAll();
	
	double calculateMaturity(Investment investment);
	Investment getById(int planId);

}
