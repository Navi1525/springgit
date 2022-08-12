package com.policyapp.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;

import com.policyapp.dao.IPolicyDAO;
import com.policyapp.dao.PolicyDAOImpl;
import com.policyapp.exception.IdNotFoundException;
import com.policyapp.exception.PolicyNotFoundException;
import com.policyapp.modal.Policy;
import com.policyapp.util.DbConnection;

public class PolicyServiceImpl implements IPolicyService {
	
	IPolicyDAO policyDAO = new PolicyDAOImpl();
	public void addPolicy(Policy policy) {
		policyDAO.addPolicy(policy);
		}
	

	public void deletePolicy(int policyId) {
		policyDAO.deletePolicy(policyId);
		
	}

	public void updatePolicy(int policyId, String coverage) {
		policyDAO.updatePolicy(policyId,coverage);
		
	}

	public List<Policy> getAll() {
		
	List<Policy> list = policyDAO.findAll();
	return list;
	}

	public List<Policy> getByType(String type) throws PolicyNotFoundException {
		List<Policy> list = policyDAO.findByType(type);
		return list;
	}

	public List<Policy> getByCategory(String category) throws PolicyNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Policy> getByCoverage(double sumAssured) throws PolicyNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Policy> getByHighSumAssured(String coverage) throws PolicyNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Policy> getByLessPremium(double premium) throws PolicyNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	public Policy getById(int policyId) throws IdNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Policy> getByBrand(String brand) throws PolicyNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	
}
