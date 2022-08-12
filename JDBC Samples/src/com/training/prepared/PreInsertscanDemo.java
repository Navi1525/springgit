package com.training.prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PreInsertscanDemo {

	public static void main(String[] args) {
		
		String url ="jdbc:mysql://localhost:3306/trialdb";
		String username = "root";
		String password = "root";
		Connection connection = null;
		PreparedStatement preparedstatement = null;
		
		try {
			connection = DriverManager.getConnection(url,username,password);
			String sql = "insert into food values(?,?,?,?)";
			preparedstatement = connection.prepareStatement(sql);
			Scanner scanner = new Scanner(System.in);
			for (int i=0;i<4;i++) {
				System.out.println("Enter Food name");
				String name =scanner.next();
				System.out.println("Enter food Id");
				int foodId =scanner.nextInt();
				System.out.println("Enter food type");
				String type = scanner.next();
				System.out.println("Enter food cost");
				float cost = scanner.nextFloat();
				
				preparedstatement.setString(1, name);
				preparedstatement.setInt(2, foodId);
				preparedstatement.setString(4, type);
				preparedstatement.setFloat(3, cost);
				preparedstatement.execute();
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
