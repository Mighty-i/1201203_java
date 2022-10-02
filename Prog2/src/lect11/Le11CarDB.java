package lect11;

import java.io.*;
import java.sql.Connection;
import java.util.*;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Le11CarDB {
	private Vector<Le11Car> Cars;

	public Le11CarDB() {
		// Initialize, yet to be implemented more
		Cars = new<Le11Car> Vector();
	}

	private void updateCar() {
		System.out.println("CarDB.updateCar()");
		try {
			System.out.print("Plate:");
			Scanner scanner = new Scanner(System.in);
			String temp = scanner.nextLine();
			int plate = Integer.parseInt(temp);
			System.out.print("Model:");
			String model = scanner.nextLine();
			System.out.print("Make:");
			String make = scanner.nextLine();
			String updateSql = "UPDATE CAR SET MODEL='" + model + "', MAKE='" + make + "' WHERE PLATE=" + plate;
			System.out.println("updateSql:" + updateSql);

			Le11ConnMariaDB connDB = new Le11ConnMariaDB();
			Connection con = connDB.getConnection();

			Statement stmnt = null;
			if (con != null) {
				stmnt = con.createStatement();
				stmnt.executeUpdate(updateSql);
				stmnt.close();
				con.close();
				System.out.println("Car updated successfully.");
			}
		} catch (NumberFormatException ex) {
			System.err.println("Error! Invalid plate.");
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	private void deleteCar() {

		System.out.println("CarDB.deleteCar()");
		try {
			System.out.print("Plate:");
			Scanner scanner = new Scanner(System.in);
			String temp = scanner.nextLine();
			int plate = Integer.parseInt(temp);
			String deleteSql = "DELETE FROM CAR WHERE PLATE=" + plate;
			System.out.println("deleteSql:" + deleteSql);

			Le11ConnMariaDB connDB = new Le11ConnMariaDB();
			Connection con = connDB.getConnection();

			Statement stmnt = null;
			if (con != null) {
				stmnt = con.createStatement();
				stmnt.executeUpdate(deleteSql);
				stmnt.close();
				con.close();
				System.out.println("Deleted successfully.");
			}
		} catch (NumberFormatException ex) {
			System.err.println("Error! Invalid plate");
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	private void searchCar() {
		System.out.println("CarDB.search()");
		try {
			System.out.print("Plate:");
			Scanner scanner = new Scanner(System.in);
			String temp = scanner.nextLine();
			int plate = Integer.parseInt(temp);
			String searchSql = "SELECT * FROM CAR WHERE PLATE=" + plate;
			System.out.println("selectSql:" + searchSql);

			Le11ConnMariaDB connDB = new Le11ConnMariaDB();
			Connection con = connDB.getConnection();

			Statement stmnt = null;
			if (con != null) {
				stmnt = con.createStatement();
				ResultSet rs = stmnt.executeQuery(searchSql);
				if (rs.next()) {
					plate = rs.getInt("PLATE");
					String model = rs.getString("MODEL");
					String make = rs.getString("MAKE");
					Le11Car car = new Le11Car(plate, model, make);
					System.out.println("Car:" + car.toString());
				}
				stmnt.close();
				con.close();
				System.out.println("Searched successfully.");
			}
		} catch (NumberFormatException ex) {
			System.err.println("Error! Invalid plate");
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	private void addCars() {
		System.out.println("CarDB.addCars()");
		try {
			System.out.print("Plate:");
			Scanner scanner = new Scanner(System.in);
			String temp = scanner.nextLine();
			int plate = Integer.parseInt(temp);
			System.out.print("Make:");
			String make = scanner.nextLine();
			System.out.print("Model:");
			String model = scanner.nextLine();
			Le11Car car = new Le11Car(plate, model, make);
			String insertSql = "INSERT INTO CAR VALUES" + "(" + car.plate + ", '" + car.model + "', '" + car.make
					+ "')";
			System.out.println("selectSql:" + insertSql);

			Le11ConnMariaDB connDB = new Le11ConnMariaDB();
			Connection con = connDB.getConnection();

			Statement stmnt = null;
			if (con != null) {
				stmnt = con.createStatement();
				stmnt.execute(insertSql);
				stmnt.close();
				con.close();
				System.out.println("Car added successfully.");
			}
		} catch (NumberFormatException ex) {
			System.err.println("Error! Invalid plate.");
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	private void viewCars() {
		System.out.println("CarDB.viewCars()");
		String selectSql = "SELECT * FROM CAR";
		System.out.println("selectSql:" + selectSql);

		Vector<Le11Car> cars = new Vector();

		Le11ConnMariaDB connDB = new Le11ConnMariaDB();
		Connection con = connDB.getConnection();

		Statement stmnt = null;
		if (con != null) {
			try {
				stmnt = con.createStatement();
				ResultSet rs = stmnt.executeQuery(selectSql);
				while (rs.next()) {
					int plate = rs.getInt("PLATE");
					String model = rs.getString("MODEL");
					String make = rs.getString("MAKE");
					Le11Car car = new Le11Car(plate, model, make);
					cars.add(car);
				}
				stmnt.close();
				con.close();
				System.out.println("Retrieved successfully.");
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		Iterator it = cars.iterator();
		while (it.hasNext()) {
			Le11Car Car = (Le11Car) it.next();
			System.out.println(Car.toString());
		}
	}

	private void mainMenu() {
		boolean cont = true;
		while (cont) {
			System.out.println("=== Main Menu ===");
			System.out.println("1 Add Car.");
			System.out.println("2 Update Car.");
			System.out.println("3 Search Car.");
			System.out.println("4 Delete Car.");
			System.out.println("9 View Cars.");
			System.out.println("0 Exit");
			System.out.print("Your choice:");
			Scanner scanner = new Scanner(System.in);
			String choice = scanner.nextLine();
			if (choice.equals("1")) {
				addCars();
			} else if (choice.equals("2")) {
				updateCar();
			} else if (choice.equals("3")) {
				searchCar();
			} else if (choice.equals("4")) {
				deleteCar();
			} else if (choice.equals("9")) {
				viewCars();
			} else if (choice.equals("0")) {
				System.out.println("Exit");
				System.out.println("GoodBye");
				break;
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("CarDB.main()");
		Le11CarDB CarDB = new Le11CarDB();
		CarDB.mainMenu();
	}
}
