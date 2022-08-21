package com.airlines.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.airlines.model.Airlines;

public class AirlineMapper implements RowMapper<Airlines> {

	public Airlines mapRow(ResultSet rs, int rowNum) throws SQLException {
		String source =rs.getString("source");
		String destination =rs.getString("destination");
		int airlineId =rs.getInt("airline_id");
		double cost =rs.getDouble("cost");
		String pnrnumber=rs.getString("pnrnumber");
		String type=rs.getString("type");
		
		Airlines airlines= new Airlines();
		airlines.setSource(source);
		airlines.setDestination(destination);
		airlines.setAirlineId(airlineId);
		airlines.setCost(cost);
		airlines.setPnrnumber(pnrnumber);
		airlines.setType(type);
		
		return airlines;
		
	}
}