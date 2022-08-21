package com.airlines.service;

import java.util.List;


import com.airlines.model.Airlines;

public interface IAirlinesService {
	
	void addAirlines(Airlines airlines);
	void updateAirlines(double cost,Integer airlineId);
	void deleteAirlines(Integer  airlineId);
	

		List<Airlines>getAll() ;
		List<Airlines>getBySource(String source) ;
		List<Airlines>getByDestination(String destination);
		List<Airlines>getByCost(double cost) ;
		List<Airlines>getBySourceAndDestination(String source,String destination) ;
		Airlines  getByAirlineId(int airlineId) ;
		
	}