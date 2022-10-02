package lect11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class Le10AddMariaDB {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection  connection = DriverManager.getConnection(
					"jdbc:mariadb://localhost:3306/test", "chatra", "1234");
			System.out.println("connection:" + connection);
			Statement stmt = connection.createStatement();
			System.out.println("stmt:" + stmt);
			String addSql = "INSERT INTO studentmark VALUES (1, 'Somchai', 'Jaidee', 49)";
			System.out.println("addSql:" + addSql);
			stmt.executeUpdate(addSql);
			stmt.close();
			System.out.println("stmt.close()");
			connection.close();
			System.out.println("connection.close()");
		} catch(ClassNotFoundException ex) {		
			System.out.println("Error! " + ex.getMessage());
			ex.printStackTrace();
		} catch(SQLException ex) {
			System.out.println("Error! " + ex.getMessage());
			ex.printStackTrace();
		}
		
		
	}

}
