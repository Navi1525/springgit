package com.training.prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class PreResultDemo {
	
	public static void main(String[] args) {
		
		String url ="jdbc:mysql://localhost:3306/trialdb";
		String username = "root";
		String password = "root";
		Connection connection = null;
		PreparedStatement preparedstatement = null;
		ResultSet resultset = null;
		
		try {
			connection = DriverManager.getConnection(url,username,password);
			String type ="Veg";
			String sql = "select * from food  where type=?";
			preparedstatement = connection.prepareStatement(sql);
			preparedstatement.setString(1, "VEG");
			resultset =preparedstatement.executeQuery();
			while (resultset.next()) {
				String name = resultset.getString("name");
				int foodId =resultset.getInt("Food_id");
				String type1 = resultset.getString("type");
				float cost = resultset.getFloat("cost");
				System.out.println(name+"\t"+foodId +"\t"+type1+"\t"+cost);
	}
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
