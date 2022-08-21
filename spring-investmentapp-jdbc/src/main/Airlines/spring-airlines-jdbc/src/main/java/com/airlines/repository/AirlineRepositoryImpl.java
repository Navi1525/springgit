package com.airlines.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.airlines.model.Airlines;
import com.airlines.util.DBQueries;

@Repository
public class AirlineRepositoryImpl implements IAirlinesRepository {

	
	@Autowired
	private JdbcTemplate jdbcTemplates;
	
	
	public void setJdbcTemplates(JdbcTemplate jdbcTemplates) {
		this.jdbcTemplates = jdbcTemplates;
	}
	
	@Override
	public void addAirlines(Airlines airlines) {
		
		Object[] airlinesArray = { airlines.getSource(), airlines.getDestination(), airlines.getType(),
				airlines.getAirlineId(), airlines.getCost(), airlines.getPnrnumber() };
		jdbcTemplates.update(DBQueries.INSERTQUERY, airlinesArray);
	}
	
	@Override
	public void updateAirlines(double cost, Integer airlineId) {
		jdbcTemplates.update(DBQueries.UPDATEQUERY,cost,airlineId);
		
	}

	@Override
	public void deleteAirlines(Integer airlineId) {
		// TODO Auto-generated method stub
		jdbcTemplates.update(DBQueries.deleteQUERY,airlineId);

	}

	@Override
	public List<Airlines> findAll() {
		// TODO Auto-generated method stub
		return findAll();
	}

	@Override
	public List<Airlines> findBySource(String source) {
		 return jdbcTemplates.query(DBQueries.SELECTBYSOURCE,( rs,  rowNum)->{
			Airlines airlines= new Airlines();
			airlines.setSource(rs.getString("source"));
			airlines.setDestination(rs.getString("destination"));
			airlines.setAirlineId(rs.getInt("airlineId"));
			airlines.setCost(rs.getDouble("cost"));
			airlines.setPnrnumber(rs.getString("pnrNumber"));
			airlines.setType(rs.getString("type"));
			return airlines;
		}, source);
				
		
	}

	@Override
	public List<Airlines> findByDestination(String destination) {
		
		return jdbcTemplates.query(DBQueries.SELECTBYDESTINATION,( rs,  rowNum)->{
			Airlines airlines= new Airlines();
			airlines.setSource(rs.getString("source"));
			airlines.setDestination(rs.getString("destination"));
			airlines.setAirlineId(rs.getInt("airlineId"));
			airlines.setCost(rs.getDouble("cost"));
			airlines.setPnrnumber(rs.getString("pnrNumber"));
			airlines.setType(rs.getString("type"));
			return airlines;
		}, destination);
				
		
	}


	@Override
	public Airlines findByAirlineId(int airlineId) {
		
		return jdbcTemplates.queryForObject(DBQueries.SELECTBYID,( rs,  rowNum)->{
			Airlines airlines= new Airlines();
			airlines.setSource(rs.getString("source"));
			airlines.setDestination(rs.getString("destination"));
			airlines.setAirlineId(rs.getInt("airlineId"));
			airlines.setCost(rs.getDouble("cost"));
			airlines.setPnrnumber(rs.getString("pnrNumber"));
			airlines.setType(rs.getString("type"));
			return airlines;
		}, airlineId);
				
			
	}


	
		
	

	

	@Override
	public List<Airlines> findByCost(double cost) {
		return jdbcTemplates.query(DBQueries.SELECTBYCOST,( rs,  rowNum)->{
			Airlines airlines= new Airlines();
			airlines.setSource(rs.getString("source"));
			airlines.setDestination(rs.getString("destination"));
			airlines.setAirlineId(rs.getInt("airlineId"));
			airlines.setCost(rs.getDouble("cost"));
			airlines.setPnrnumber(rs.getString("pnrNumber"));
			airlines.setType(rs.getString("type"));
			return airlines;
		}, cost);
				
		
	}

	@Override
	public List<Airlines> findBySourceAndDestination(String source, String destination) {
		
		return jdbcTemplates.query(DBQueries.SELECTBYSOURCEANDDESTINATION,( rs,  rowNum)->{
			Airlines airlines= new Airlines();
			airlines.setSource(rs.getString("source"));
			airlines.setDestination(rs.getString("destination"));
			airlines.setAirlineId(rs.getInt("airlineId"));
			airlines.setCost(rs.getDouble("cost"));
			airlines.setPnrnumber(rs.getString("pnrNumber"));
			airlines.setType(rs.getString("type"));
			return airlines;
		}, source,destination);
	}

}