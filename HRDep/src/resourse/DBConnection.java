package resourse;

import java.sql.Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.sql.rowset.JdbcRowSet;

public class DBConnection {
	private static Connection connection = null;

	public static Connection getConnection() throws ClassNotFoundException {

		try {

			try {
				Class.forName("org.postgresql.Driver").newInstance();
			} catch (InstantiationException e) {

				e.printStackTrace();
			} catch (IllegalAccessException e) {

				e.printStackTrace();
			}
			String url = "jdbc:postgresql://localhost/";
			String name = "postgres";
			String password = "qwerty123";
			Connection connection = DriverManager.getConnection(url, name, password);
			System.out.println("OK");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
}
