package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class DbUtill {
	
	private static final String URL = "jdbc:mysql://localhost:3306/practicdb";
	private static final String USERNAME ="d1_83855_devesh";
	private static final String PASSWORD = "student";
	
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(URL, PASSWORD,USERNAME);
	}
	

}
