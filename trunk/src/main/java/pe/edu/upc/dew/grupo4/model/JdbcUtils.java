package pe.edu.upc.dew.grupo4.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.commons.dbutils.DbUtils;

public class JdbcUtils {

	public static Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			//Class.forName("org.hsqldb.jdbc.JDBCDriver");
			// URL, usuario y password
			connection = DriverManager.getConnection("jdbc:mysql://localhost/cinema",
					"cinema", "cinema");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
}
