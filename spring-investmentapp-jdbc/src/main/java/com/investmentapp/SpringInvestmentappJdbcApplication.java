package com.investmentapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.investmentapp.modal.Investment;
import com.investmentapp.modal.Nominee;
import com.investmentapp.modal.PlanType;
import com.investmentapp.modal.Purpose;
import com.investmentapp.modal.Risk;
import com.investmentapp.service.IInvestmentService;
import com.investmentapp.service.InvestmentServiceImpl;

@SpringBootApplication
public class SpringInvestmentappJdbcApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringInvestmentappJdbcApplication.class, args);
		
		
	}
	@Autowired
	IInvestmentService investmentService;

	@Override
	public void run(String... args) throws Exception {
		Investment investment =new Investment("VoyaMutual",10 ,PlanType.mutual.type,10000,Purpose.MARRIAGE.name(),Risk.HIGH.name(),Nominee.SON.name(),10 );
		//investmentService.addInvestment(investment);
		//Investment investment =new Investment();
		//investmentService.getAll().forEach(System.out::println);
		//investmentService.getByPurpose("single").forEach(System.out::println);
		//System.out.println(investmentService.getById(1));
		//investmentService.getByRiskAndTerm("High", 10).forEach(System.out::println);
		investmentService.getByType("MutualFund").forEach(System.out::println);
	}

}
