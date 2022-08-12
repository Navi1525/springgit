package com.policyapp.client;

import com.policyapp.modal.Policy;
import com.policyapp.service.IPolicyService;
import com.policyapp.service.PolicyServiceImpl;

public class User {

	public static void main(String[] args) {
		IPolicyService policyservice = new PolicyServiceImpl();
//		Policy policy = new Policy("JeevanSathi", 1, 20000, "Life", 5, "Pension", " General", "Star",500000);
//	Policy policy = new Policy("LIC", 1, 800, "Life", 3, "Pension", " General", "Star",500000);
//		policyservice.addPolicy(policy);
		//policyservice.deletePolicy(1);
	//	policyservice.updatePolicy(2, "Health");
//		policyservice.getAll();
//		Policy policy2 = new Policy("Star-Classic", 4, 5000, "Illness",2,"Health", "General", " Star", 1000000);
//		policyservice.addPolicy(policy2);
		try {
		policyservice.getAll().forEach(System.out::println);
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}
