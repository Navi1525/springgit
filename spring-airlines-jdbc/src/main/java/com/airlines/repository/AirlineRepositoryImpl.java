package com.airlines.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.airlines.model.Airlines;

@Repository
public class AirlineRepositoryImpl implements IAirlineRepository {

	
	@Autowired
	private JdbcTemplate jdbcTemplates;
	
	
	public void setJdbcTemplates(JdbcTemplate jdbcTemplates) {
		this.jdbcTemplates = jdbcTemplates;
	}

	@Override
	public List<Airlines> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Airlines> findBySource() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Airlines> findByDestination() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Airlines> findByCost() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Airlines findByAirlineId(int airlineId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Airlines> findBySourceAndDestination() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addAirlines(Airlines airlines) {
		
		Object[] =
		
	}

	@Override
	public void updateAirlines(double cost, Integer airlineId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAirlines(Integer airlineId) {
		// TODO Auto-generated method stub
		
	}

}
