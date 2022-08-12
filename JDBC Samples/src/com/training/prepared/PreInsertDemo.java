package com.training.prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreInsertDemo {
	
	public static void main(String[] args) {
		
		String url ="jdbc:mysql://localhost:3306/trialdb";
		String username = "root";
		String password = "root";
		Connection connection = null;
		PreparedStatement preparedstatement =null;
		
		try {
			connection = DriverManager.getConnection(url,username,password);
			String sql = "insert into food values (?,?,?,?)";
			preparedstatement = connection.prepareStatement(sql);
			preparedstatement.setString(1, "MASALA DOSA");
			preparedstatement.setInt(2, 10);
			preparedstatement.setFloat(3, 120);
			preparedstatement.setString(4, "VEGETERIAN");
			preparedstatement.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if (connection !=null)
					connection.close();
				if(preparedstatement != null)
					preparedstatement.close();
					
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
