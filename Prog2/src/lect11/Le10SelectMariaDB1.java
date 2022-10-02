package lect11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class Le10SelectMariaDB1 {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection  connection = DriverManager.getConnection(
					"jdbc:mariadb://localhost:3306/test", "chatra", "1234");
			System.out.println("connection:" + connection);
			Statement stmt = connection.createStatement();
			System.out.println("stmt:" + stmt);
			String selectSql = "SELECT * from studentmark WHERE id=2";
			ResultSet rs = stmt.executeQuery(selectSql);
			while(rs != null && rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String surname = rs.getString("surname");
				int mark = rs.getInt("mark");
				System.out.println(id + ", " + name + ", " + surname + ", " + mark);
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
