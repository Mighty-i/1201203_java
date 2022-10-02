package lect11;

import java.util.Scanner;
import java.sql.*;

public class Le11TestConnectDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("TestConnectDB.main()");
		// Le11ConnOracleDB connDB = new Le11ConnOracleDB();
		Le11ConnMariaDB connDB = new Le11ConnMariaDB();
		Connection con = connDB.getConnection();
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		if(con!=null) {
			try {
				con.close();
				System.out.println("Connection closed!");
			} catch(Exception ex) {
				;
			}
		}

	}

}
