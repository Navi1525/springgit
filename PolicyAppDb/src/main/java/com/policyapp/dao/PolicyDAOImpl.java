package com.policyapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.policyapp.exception.IdNotFoundException;
import com.policyapp.exception.PolicyNotFoundException;
import com.policyapp.modal.Policy;
import com.policyapp.util.DbConnection;

public class PolicyDAOImpl implements IPolicyDAO {

	private static final String policy_name = null;
	private static final Integer policy_id = null;
	private double sum_Assured;

	public void addPolicy(Policy policy) {
		PreparedStatement preparedstatement;
		String sql = "insert into policy(policy_name,premium,type,duration,coverage,brand,category,sum_assured) values (?,?,?,?,?,?,?,?)";
		Connection connection = DbConnection.openconnection();
		preparedstatement = null;
		try {
			preparedstatement = connection.prepareStatement(sql);
			preparedstatement.setString(1, policy.getPolicyname());
			preparedstatement.setDouble(2, policy.getPremium());
			preparedstatement.setString(3, policy.getType());
			preparedstatement.setInt(4, policy.getDuration());
			preparedstatement.setString(5, policy.getCoverage());

			preparedstatement.setString(6, policy.getBrand());
			preparedstatement.setString(7, policy.getCategory());
			preparedstatement.setDouble(8, policy.getSumAssured());
			preparedstatement.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				DbConnection.closeConnection();
				if (preparedstatement != null)
					preparedstatement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	public void deletePolicy(int policyId) {
		String sql = "delete from policy where policy_Id=" + policyId;
		Connection connection = DbConnection.openconnection();
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				DbConnection.closeConnection();
				if (preparedStatement != null)
					preparedStatement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void updatePolicy(int policyId, String coverage) {
		String sql = "update policy set coverage=? where policy_Id=?";
		Connection connection = DbConnection.openconnection();
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, coverage);
			preparedStatement.setInt(2, policyId);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				DbConnection.closeConnection();
				if (preparedStatement != null)
					preparedStatement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public List<Policy> findAll() {
		Connection connection = DbConnection.openconnection();
		PreparedStatement preparedStatement = null;
		ResultSet rs = null;
		String sql = "select * from policy";
		List<Policy> policyList = new ArrayList<Policy>();
		try {
			preparedStatement = connection.prepareStatement(sql);

			rs = preparedStatement.executeQuery();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			while (rs.next()) {
				String name = rs.getString("Policy_Name");
				int id = rs.getInt("policy_id");
				String type = rs.getString("type");
				double premium = rs.getDouble("premium");
				int duration = rs.getInt("duration");
				String coverage = rs.getString("coverage");
				String category = rs.getString("category");
				String brand = rs.getString("brand");
				double sumAssured = rs.getDouble("sum_Assured");
				Policy policy = new Policy(name, id, premium, type, duration, coverage, category, brand, sumAssured);
				policyList.add(policy);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
				if (preparedStatement != null)
					preparedStatement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;

	}

	public List<Policy> findByType(String mtype) throws PolicyNotFoundException {
		Connection connection = DbConnection.openconnection();
		PreparedStatement preparedStatement = null;
		ResultSet rs = null;
		String sql = "select * from policy where type=?";
		List<Policy> policyList = new ArrayList<Policy>();
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, mtype);
			rs = preparedStatement.executeQuery();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			while (rs.next()) {
				String name = rs.getString("Policy_Name");
				int id = rs.getInt("policy_id");
				String type = rs.getString("type");
				double premium = rs.getDouble("premium");
				int duration = rs.getInt("duration");
				String coverage = rs.getString("coverage");
				String category = rs.getString("category");
				String brand = rs.getString("brand");
				double sumAssured = rs.getDouble("sum_Assured");
				Policy policy = new Policy(name, id, premium, type, duration, coverage, category, brand, sumAssured);
				policyList.add(policy);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
				if (preparedStatement != null)
					preparedStatement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;

	}

	public List<Policy> findByCategory(String ncategory) throws PolicyNotFoundException {
		Connection connection = DbConnection.openconnection();
		PreparedStatement preparedStatement = null;
		ResultSet rs = null;
		String sql = "select * from policy where category= ?";
		List<Policy> policyList = new ArrayList<Policy>();
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, ncategory);
			rs = preparedStatement.executeQuery();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			while (rs.next()) {
				String name = rs.getString("Policy_Name");
				int id = rs.getInt("policy_id");
				String type = rs.getString("type");
				double premium = rs.getDouble("premium");
				int duration = rs.getInt("duration");
				String coverage = rs.getString("coverage");
				String category= rs.getString("category");
				String brand = rs.getString("brand");
				double sumAssured = rs.getDouble("sum_Assured");
				Policy policy = new Policy(name, id, premium, type, duration, coverage, category1, brand, sumAssured);
				policyList.add(policy);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
				if (preparedStatement != null)
					preparedStatement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;

	}

	public List<Policy> findByHighSumAssured(String coverage) throws PolicyNotFoundException {
		Connection connection = DbConnection.openconnection();
		PreparedStatement preparedStatement = null;
		ResultSet rs = null;
		String sql = "select * from policy";
		List<Policy> policyList = new ArrayList<Policy>();
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.execute();
			rs = preparedStatement.executeQuery();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			while (rs.next()) {
				String name = rs.getString("Policy_Name");
				int id = rs.getInt("policy_id");
				String type = rs.getString("type");
				double premium = rs.getDouble("premium");
				int duration = rs.getInt("duration");
				String coverage = rs.getString("coverage");
				String category = rs.getString("category");
				String brand = rs.getString("brand");
				double sumAssured = rs.getDouble("sum_Assured");
				Policy policy = new Policy(name, id, premium, type, duration, coverage, category, brand, sumAssured);
				policyList.add(policy);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
				if (preparedStatement != null)
					preparedStatement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;

	}

	public List<Policy> findByLessPremium(double premium) throws PolicyNotFoundException {
		Connection connection = DbConnection.openconnection();
		PreparedStatement preparedStatement = null;
		ResultSet rs = null;
		String sql = "select * from policy";
		List<Policy> policyList = new ArrayList<Policy>();
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.execute();
			rs = preparedStatement.executeQuery();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			while (rs.next()) {
				String name = rs.getString("Policy_Name");
				int id = rs.getInt("policy_id");
				String type = rs.getString("type");
				double premium = rs.getDouble("premium");
				int duration = rs.getInt("duration");
				String coverage = rs.getString("coverage");
				String category = rs.getString("category");
				String brand = rs.getString("brand");
				double sumAssured = rs.getDouble("sum_Assured");
				Policy policy = new Policy(name, id, premium, type, duration, coverage, category, brand, sumAssured);
				policyList.add(policy);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
				if (preparedStatement != null)
					preparedStatement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;

	}

	public Policy findById(int policyId) throws IdNotFoundException {
		Connection connection = DbConnection.openconnection();
		PreparedStatement preparedStatement = null;
		ResultSet rs = null;
		String sql = "select * from policy";
		List<Policy> policyList = new ArrayList<Policy>();
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.execute();
			rs = preparedStatement.executeQuery();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			while (rs.next()) {
				String name = rs.getString("Policy_Name");
				int id = rs.getInt("policy_id");
				String type = rs.getString("type");
				double premium = rs.getDouble("premium");
				int duration = rs.getInt("duration");
				String coverage = rs.getString("coverage");
				String category = rs.getString("category");
				String brand = rs.getString("brand");
				double sumAssured = rs.getDouble("sum_Assured");
				Policy policy = new Policy(name, id, premium, type, duration, coverage, category, brand, sumAssured);
				policyList.add(policy);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
				if (preparedStatement != null)
					preparedStatement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;

	}

	public List<Policy> findByBrand(String brand) throws PolicyNotFoundException {
		Connection connection = DbConnection.openconnection();
		PreparedStatement preparedStatement = null;
		ResultSet rs = null;
		String sql = "select * from policy";
		List<Policy> policyList = new ArrayList<Policy>();
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.execute();
			rs = preparedStatement.executeQuery();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			while (rs.next()) {
				String name = rs.getString("Policy_Name");
				int id = rs.getInt("policy_id");
				String type = rs.getString("type");
				double premium = rs.getDouble("premium");
				int duration = rs.getInt("duration");
				String coverage = rs.getString("coverage");
				String category = rs.getString("category");
				String brand = rs.getString("brand");
				double sumAssured = rs.getDouble("sum_Assured");
				Policy policy = new Policy(name, id, premium, type, duration, coverage, category, brand, sumAssured);
				policyList.add(policy);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
				if (preparedStatement != null)
					preparedStatement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;

	}

	public List<Policy> findByCoveage(double sumAssured) throws PolicyNotFoundException {
		Connection connection = DbConnection.openconnection();
		PreparedStatement preparedStatement = null;
		ResultSet rs = null;
		String sql = "select * from policy";
		List<Policy> policyList = new ArrayList<Policy>();
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.execute();
			rs = preparedStatement.executeQuery();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			while (rs.next()) {
				String name = rs.getString("Policy_Name");
				int id = rs.getInt("policy_id");
				String type = rs.getString("type");
				double premium = rs.getDouble("premium");
				int duration = rs.getInt("duration");
				String coverage = rs.getString("coverage");
				String category = rs.getString("category");
				String brand = rs.getString("brand");
				double sumAssured = rs.getDouble("sum_Assured");
				Policy policy = new Policy(name, id, premium, type, duration, coverage, category, brand, sumAssured);
				policyList.add(policy);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
				if (preparedStatement != null)
					preparedStatement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;

	}

}
