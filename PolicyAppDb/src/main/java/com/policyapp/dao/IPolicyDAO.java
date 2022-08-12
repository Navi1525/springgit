package com.policyapp.dao;

import java.util.List;

import com.policyapp.exception.IdNotFoundException;
import com.policyapp.exception.PolicyNotFoundException;
import com.policyapp.modal.Policy;

public interface IPolicyDAO {
	
	void addPolicy(Policy policy);
	void deletePolicy(int policyId);
	void updatePolicy(int policyId,String coverage);

	List<Policy>findAll();
	List<Policy>findByType( String type) throws PolicyNotFoundException;
	List<Policy>findByCategory( String category)throws PolicyNotFoundException;
	List<Policy>findByCoveage( double sumAssured)throws PolicyNotFoundException;
	List<Policy>findByHighSumAssured( String coverage)throws PolicyNotFoundException;
	List<Policy>findByLessPremium( double premium)throws PolicyNotFoundException;
	List<Policy>findByBrand( String brand)throws PolicyNotFoundException;
	Policy findById(int policyId)throws IdNotFoundException;
}
