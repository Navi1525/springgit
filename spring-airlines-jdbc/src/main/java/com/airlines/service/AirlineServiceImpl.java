package com.airlines.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.airlines.model.Airlines;
import com.airlines.repository.IAirlineRepository;

@Service
public class AirlineServiceImpl implements IAirlineService {

	
	private IAirlineRepository airlineRepository;
	@Override
	public List<Airlines> getAll() {

		return null;
	}

	@Override
	public List<Airlines> getBySource() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Airlines> getByDestination() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Airlines> getByCost() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Airlines getByAirlineId(int airlineId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Airlines> getBySourceAndDestination() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addAirlines(Airlines airlines) {
		// TODO Auto-generated method stub
		
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
