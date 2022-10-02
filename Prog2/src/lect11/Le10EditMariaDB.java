package lect11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Le10EditMariaDB {

	public static void main(String[] args) {
		
		String[] editSql = {"UPDATE studentmark SET name='Somchai-changed', surname='Jaidee-changed' WHERE id=1",
				"UPDATE studentmark SET name='Banjong', surname='Narongchai', mark=69 WHERE id=2",
				"UPDATE studentmark SET name='Harry', surname='Kane', mark=79 WHERE id=3"};

		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection  connection = DriverManager.getConnection(
					"jdbc:mariadb://localhost:3306/test", "chatra", "1234");
			System.out.println("connection:" + connection);
			Statement stmt = connection.createStatement();
			System.out.println("stmt:" + stmt);			
			for(int i=0; i<editSql.length; i++) {
				System.out.println("addSql[" + i + "]:" + editSql[i]);
				stmt.executeUpdate(editSql[i]);
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
