package pl.migibud.mysqlpmig.ex2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AppSelect {

	public static void main(String[] args) throws SQLException {

		Connection connection = DatabaseConnection.getMySQLDatabaseConnection();

		if (connection!=null){
			System.out.println("Database world connected");
		}

		Statement statement = null;
		statement = connection.createStatement();
		String sql = "SELECT Name, Population FROM city limit 10";
		ResultSet resultSet = statement.executeQuery(sql);

		while (resultSet.next()){
			System.out.println(resultSet.getString(1)+" | "+resultSet.getString(2));
		}



		resultSet.close();
		statement.close();
		connection.close();

	}

}
