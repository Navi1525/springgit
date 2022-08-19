package com.investmentapp.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.investmentapp.modal.Investment;
import com.investmentapp.util.DBQueries;

@Repository
public class InvestmentRepositoryImpl implements IInvestmentRepository {
	@Autowired
	private JdbcTemplate jdbcTemplates;

	public void setJdbcTemplates(JdbcTemplate jdbcTemplates) {
		this.jdbcTemplates = jdbcTemplates;
	}

	@Override
	public void addInvestment(Investment investment) {
		// String sql =DBQueries.INSERTQUERY;
		Object[] investmentArray = { investment.getPlanName(), investment.getEntryAge(), investment.getType(),
				investment.getAmount(), investment.getPurpose(), investment.getRisk(), investment.getNominee(),
				investment.getTerm() };
		jdbcTemplates.update(DBQueries.INSERTQUERY, investmentArray);
	}

	@Override
	public void updateInvestment(int planId, double amount) {
		String sql = DBQueries.UPDATEQUERY;
		jdbcTemplates.update(DBQueries.UPDATEQUERY, planId, amount);

	}

	@Override
	public void deleteInvestment(int planId) {
		String sql = DBQueries.deleteQUERY;
		jdbcTemplates.update(DBQueries.deleteQUERY, planId);

	}

	@Override
	public List<Investment> findByRiskAndTerm(String risk, int term) {

		return jdbcTemplates.query(DBQueries.SELECTBYRISKTERM, new RowMapper<Investment>() {

			@Override
			public Investment mapRow(ResultSet rs, int rowNum) throws SQLException {
				Investment investment = new Investment();
				investment.setPlanName(rs.getString("plan_name"));
				investment.setPurpose(rs.getString("purpose"));
				investment.setAmount(rs.getDouble("amount"));
				investment.setEnterAge(rs.getInt("entry_age"));
				investment.setRisk(rs.getString("risk"));
				investment.setNominee(rs.getString("nominee"));
				investment.setType(rs.getString("type"));
				investment.setTerm(rs.getInt("term"));
				investment.setPlanId(rs.getInt("plan_Id"));
				return investment;
			}

		}, risk, term);
	}

	@Override
	public List<Investment> findByType(String type) {

		return jdbcTemplates.query(DBQueries.SELECTBYTYPE, new RowMapper<Investment>() {

			@Override
			public Investment mapRow(ResultSet rs, int rowNum) throws SQLException {
				Investment investment = new Investment();
				investment.setPlanName(rs.getString("plan_name"));
				investment.setPurpose(rs.getString("purpose"));
				investment.setAmount(rs.getDouble("amount"));
				investment.setEnterAge(rs.getInt("entry_age"));
				investment.setRisk(rs.getString("risk"));
				investment.setNominee(rs.getString("nominee"));
				investment.setType(rs.getString("type"));
				investment.setTerm(rs.getInt("term"));
				investment.setPlanId(rs.getInt("plan_Id"));
				return investment;
			}

		}, type);
	}

	@Override
	public List<Investment> findByPurpose(String purpose) {
		List<Investment> investments = jdbcTemplates.query(DBQueries.SELECTBYPURPOSE, new RowMapper<Investment>() {

			@Override
			public Investment mapRow(ResultSet rs, int rowNum) throws SQLException {
				Investment investment = new Investment();
				investment.setPlanName(rs.getString("plan_name"));
				investment.setPurpose(rs.getString("purpose"));
				investment.setAmount(rs.getDouble("amount"));
				investment.setEnterAge(rs.getInt("entry_age"));
				investment.setRisk(rs.getString("risk"));
				investment.setNominee(rs.getString("nominee"));
				investment.setType(rs.getString("type"));
				investment.setTerm(rs.getInt("term"));
				investment.setPlanId(rs.getInt("plan_Id"));
				return investment;
			}

		}, purpose);
		return investments;
	}

	@Override
	public List<Investment> findAll() {
		RowMapper<Investment> mapper = new InvestmentMapper();
		List<Investment> investments = jdbcTemplates.query(DBQueries.SELECTQUERY, mapper);
		return investments;
	}

	@Override
	public Investment findById(int planId) {
		Investment ninvestment = jdbcTemplates.queryForObject(DBQueries.SELECTBYID, (rs, rowNum) -> {
			Investment investment = new Investment();
			investment.setPlanName(rs.getString("plan_name"));
			investment.setPurpose(rs.getString("purpose"));
			investment.setAmount(rs.getDouble("amount"));
			investment.setEnterAge(rs.getInt("entry_age"));
			investment.setRisk(rs.getString("risk"));
			investment.setNominee(rs.getString("nominee"));
			investment.setType(rs.getString("type"));
			investment.setTerm(rs.getInt("term"));
			investment.setPlanId(planId);
			return investment;
		}, planId);
		return ninvestment;
	}

}
