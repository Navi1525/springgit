package com.airlines.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.airlines.model.Airlines;
import com.airlines.repository.IAirlinesRepository;

@Service
public class AirlineServiceImpl implements IAirlinesService {

	
	private IAirlinesRepository airlineRepository;

	@Override
	public void addAirlines(Airlines airlines) {
		airlineRepository.addAirlines(airlines);
	}

	@Override
	public void updateAirlines(double cost, Integer airlineId) {
		// TODO Auto-generated method stub
		airlineRepository.updateAirlines(cost, airlineId);
		
	}

	@Override
	public void deleteAirlines(Integer airlineId) {
		// TODO Auto-generated method stub
		airlineRepository.deleteAirlines(airlineId);
	}

	@Override
	public List<Airlines> getAll() {
		// TODO Auto-generated method stub
		return airlineRepository.findAll();
	}

	@Override
	public List<Airlines> getBySource(String source) {
		// TODO Auto-generated method stub
		return airlineRepository.findBySource(source);
	}

	@Override
	public List<Airlines> getByDestination(String destination) {
		// TODO Auto-generated method stub
		return airlineRepository.findByDestination(destination);
	}

	@Override
	public List<Airlines> getByCost(double cost) {
		// TODO Auto-generated method stub
		return airlineRepository.findByCost(cost);
	}

	@Override
	public List<Airlines> getBySourceAndDestination(String source, String destination) {
		// TODO Auto-generated method stub
		return airlineRepository.findBySourceAndDestination(source, destination);
	}

	@Override
	public Airlines getByAirlineId(int airlineId) {
		// TODO Auto-generated method stub
		return airlineRepository.findByAirlineId(airlineId);
	}
	
}