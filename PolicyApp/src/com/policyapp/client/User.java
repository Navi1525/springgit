package com.policyapp.client;

import com.policyapp.exception.IdNotFoundException;
import com.policyapp.exception.PolicyNotFoundException;
import com.policyapp.service.IPolicyService;
import com.policyapp.service.PolicyServiceImpl;

public class User {

	public static void main(String[] args) {

		IPolicyService policyServices = new PolicyServiceImpl();

		try {
			
			policyServices.getAll().forEach(System.out::println);
			System.out.println();
			policyServices.getByType("endowment").forEach(System.out::println);
			System.out.println();
			policyServices.getByCategory("lifr").forEach(System.out::println);
			System.out.println();
			policyServices.getByHighSumAssured(200000).forEach(System.out::println);
			System.out.println();
			policyServices.getByCoverage("general").forEach(System.out::println);
			System.out.println();
			policyServices.getByLessPremium(2000).forEach(System.out::println);
			System.out.println();
			System.out.println(policyServices.getById(188));

		} catch (PolicyNotFoundException | IdNotFoundException e) {
			System.out.println(e.getMessage());
		}

	}

}