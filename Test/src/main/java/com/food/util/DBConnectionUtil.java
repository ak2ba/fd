package com.food.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnectionUtil {

	private static Connection con;

	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/online_food_delivery","root","root");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return con;
	}
	
}
