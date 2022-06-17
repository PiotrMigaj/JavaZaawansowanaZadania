package pl.migibud.mysqlpmig.ex5;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class AppDropTable {

	public static void main(String[] args) throws SQLException {

		Connection connection = DatabaseConnection.getMySQLDatabaseConnection();

		if (connection != null) {
			System.out.println("Database cinema connected");
		}

		Statement statement = null;
		statement = connection.createStatement();
		String sql = "DROP TABLE director";

		statement.executeUpdate(sql);

		statement.close();
		connection.close();

	}

}
