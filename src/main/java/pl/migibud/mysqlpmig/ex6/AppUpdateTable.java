package pl.migibud.mysqlpmig.ex6;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AppUpdateTable {

	public static void main(String[] args) throws SQLException {

		Connection connection = DatabaseConnection.getMySQLDatabaseConnection();

		if (connection != null) {
			System.out.println("Database cinema connected");
		}

		Statement statement = null;
		statement = connection.createStatement();
		String sql = "UPDATE director SET lastName = 'Migaj' WHERE id = 1";

		statement.executeUpdate(sql);

		String sql2 = "SELECT * FROM director";
		ResultSet resultSet = statement.executeQuery(sql2);

		while (resultSet.next()){
			System.out.println(resultSet.getString(1)+" | "+resultSet.getString(2) + " | "+resultSet.getString(3));
		}

		statement.close();
		connection.close();

	}

}
