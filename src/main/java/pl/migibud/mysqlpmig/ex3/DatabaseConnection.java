package pl.migibud.mysqlpmig.ex3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class DatabaseConnection {

	private static final String DATABASE_NAME = "cinema";
	private static Connection MySQL_CONNECTION;

	private DatabaseConnection(){}

	public static Connection getMySQLDatabaseConnection() throws SQLException {
		if (MySQL_CONNECTION ==null){
			String url = "jdbc:mysql://127.0.0.1:3306/"+ DATABASE_NAME;
			MySQL_CONNECTION = DriverManager.getConnection(url,"root","Stefan0987");
		}
		return MySQL_CONNECTION;
	}

	public static boolean closeMySQLDatabaseConnection() throws SQLException {
		if (MySQL_CONNECTION==null){
			return false;
		}
		MySQL_CONNECTION.close();
		return true;
	}
}
