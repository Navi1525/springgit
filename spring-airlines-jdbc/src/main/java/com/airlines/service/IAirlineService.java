package com.airlines.service;

import java.util.List;


import com.airlines.model.Airlines;

public interface IAirlineService {
	
	void addAirlines(Airlines airlines);
	void updateAirlines(double cost,Integer airlineId);
	void deleteAirlines(Integer  airlineId);
	

		List<Airlines>getAll() ;
		List<Airlines>getBySource() ;
		List<Airlines>getByDestination();
		List<Airlines>getByCost() ;
		List<Airlines>getBySourceAndDestination() ;
		Airlines  getByAirlineId(int airlineId) ;
		
	}


