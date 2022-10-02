package lect11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Le11ConnOracleDB {
	public Connection getConnection() {

		System.out.println("-------- Oracle JDBC Connection Testing ------");

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");

		} catch (ClassNotFoundException e) {

			System.out.println("Where is your Oracle JDBC Driver?");
			e.printStackTrace();
		}

		Connection connection = null;
		System.out.println("Oracle JDBC Driver Registered!");

		try {

			connection = DriverManager.getConnection("jdbc:oracle:thin:@10.30.2.50:1521:prog2", 
			"your-username", "your-password");

		} catch (SQLException e) {

			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
		}

		if (connection != null) {
			System.out.println("You made it, take control your database now!");
		} else {
			System.out.println("Failed to make connection!");
		}
		
		System.out.println("Connected to database");
		return connection;
	}
}
