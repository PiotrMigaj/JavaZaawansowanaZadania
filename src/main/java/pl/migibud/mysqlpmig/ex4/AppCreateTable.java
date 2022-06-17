package pl.migibud.mysqlpmig.ex4;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AppCreateTable {

	public static void main(String[] args) throws SQLException {

		Connection connection = DatabaseConnection.getMySQLDatabaseConnection();

		if (connection != null) {
			System.out.println("Database cinema connected");
		}

		Statement statement = null;
		statement = connection.createStatement();
		String sql = "CREATE TABLE IF NOT EXISTS director(" +
				"id INT AUTO_INCREMENT PRIMARY KEY," +
				"name VARCHAR(30) NOT NULL," +
				"lastName VARCHAR(30) NOT NULL" +
				")";

		statement.executeUpdate(sql);

		statement.close();
		connection.close();

	}

}
