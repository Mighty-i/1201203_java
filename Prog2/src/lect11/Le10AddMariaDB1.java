package lect11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Le10AddMariaDB1 {

	public static void main(String[] args) {
		
		String[] addSql = {"INSERT INTO studentmark VALUES (1, 'Somchai', 'Jaidee', 49)",
				"INSERT INTO studentmark VALUES (2, 'Somchai', 'Jaidee', 49)",
				"INSERT INTO studentmark VALUES (3, 'Somchai', 'Jaidee', 49)"};

		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection  connection = DriverManager.getConnection(
					"jdbc:mariadb://localhost:3306/test", "chatra", "1234");
			System.out.println("connection:" + connection);
			Statement stmt = connection.createStatement();
			System.out.println("stmt:" + stmt);			
			for(int i=0; i<addSql.length; i++) {
				System.out.println("addSql[" + i + "]:" + addSql[i]);
				stmt.executeUpdate(addSql[i]);
			}
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
