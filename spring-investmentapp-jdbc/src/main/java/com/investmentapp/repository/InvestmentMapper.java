package com.investmentapp.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.investmentapp.modal.Investment;

public class InvestmentMapper implements RowMapper<Investment>{

	@Override
	public Investment mapRow(ResultSet rs, int rowNum) throws SQLException {
		String planName =rs.getString("plan_name");
		String purpose =rs.getString("purpose");
		String nominee =rs.getString("nominee");
		String Type =rs.getString("type");
		String risk =rs.getString("risk");
		int term =rs.getInt("term");
		int entryAge =rs.getInt("entry_age");
		double amount =rs.getDouble("amount");
		int planId =rs.getInt("plan_id");
		
		Investment investment= new Investment();
		
		investment.setAmount(amount);
		investment.setEnterAge(entryAge);
		investment.setNominee(nominee);
		investment.setType(Type);
		investment.setPurpose(purpose);
		investment.setPlanId(planId);
		investment.setPlanName(planName);
		investment.setRisk(risk);
		investment.setTerm(term);
		
		return investment;
	}

}
