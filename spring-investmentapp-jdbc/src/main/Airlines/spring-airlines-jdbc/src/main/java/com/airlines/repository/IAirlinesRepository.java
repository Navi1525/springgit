package com.airlines.repository;

import java.util.List;


import com.airlines.model.Airlines;

public interface IAirlinesRepository {
	
	
	void addAirlines(Airlines airlines);
	void updateAirlines(double cost,Integer airlineId);
	void deleteAirlines(Integer  airlineId);
	
	
	List<Airlines>findAll() ;
	List<Airlines>findBySource(String source) ;
	List<Airlines>findByDestination(String destination);
	List<Airlines>findByCost(double cost) ;
	List<Airlines>findBySourceAndDestination(String source,String destination) ;
	Airlines  findByAirlineId(int airlineId) ;


}
