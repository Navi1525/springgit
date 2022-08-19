package com.airlines.repository;

import java.util.List;


import com.airlines.model.Airlines;

public interface IAirlineRepository {
	
	
	void addAirlines(Airlines airlines);
	void updateAirlines(double cost,Integer airlineId);
	void deleteAirlines(Integer  airlineId);
	
	
	List<Airlines>findAll() ;
	List<Airlines>findBySource() ;
	List<Airlines>findByDestination();
	List<Airlines>findByCost() ;
	List<Airlines>findBySourceAndDestination() ;
	Airlines  findByAirlineId(int airlineId) ;


}
