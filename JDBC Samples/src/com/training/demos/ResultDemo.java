package com.training.demos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultDemo {
	
	public static void main(String[] args) {
		String url ="jdbc:mysql://localhost:3306/trialdb";
		String username = "root";
		String password = "root";
		Connection connection = null;
		Statement statement = null;
		ResultSet rs =null;
		
		try {
			connection = DriverManager.getConnection(url,username,password);
			statement = connection.createStatement();
			String sql = "select * from policy";
			statement.executeQuery(sql);
			 rs =statement.executeQuery(sql);
			while(rs.next()) {
				String name =rs.getString("name");
				int policyId = rs.getInt("policy_id");
				String type = rs.getString(3);
				float premium =rs.getFloat("premium");
				System.out.println(name+"\t"+policyId+"\t"+type+"\t"+premium);
			}
			
//			boolean result = statement.execute(sql);
//			System.out.println("Table created "+result);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if (connection !=null)
					connection.close();
				if(statement != null)
					statement.close();
				if(rs!= null)
					rs.close();
					
			}catch(SQLException e) {
				e.printStackTrace();
			}
			
			
	}

}
}
