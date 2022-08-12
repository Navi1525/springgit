package com.training.prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//import java.sql.Statement;

public class PrecreateDemo {
	
	public static void main(String[] args) {
		
		String url ="jdbc:mysql://localhost:3306/trialdb";
		String username = "root";
		String password = "root";
		Connection connection = null;
		PreparedStatement preparedstatement =null;
		
		try {
			connection = DriverManager.getConnection(url,username,password);
			String sql ="create  table Food (name varchar(20) , food_id int primary key ,cost float ,type varchar(20))";
			preparedstatement = connection.prepareStatement(sql);
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
