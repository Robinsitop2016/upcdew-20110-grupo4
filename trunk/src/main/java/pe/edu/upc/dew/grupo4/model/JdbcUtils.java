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
			Class.forName("org.hsqldb.jdbc.JDBCDriver");
			// URL, usuario y password
			connection = DriverManager.getConnection("jdbc:hsqldb:mem:test",
					"sa", "");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}

	public static void create() {
		Connection connection = getConnection();
		try {
			Statement statement = connection.createStatement();
			statement
					.execute("create table pelicula(cod_pelicula integer primary key, " +
							"nam_pelicula varchar(50), gen_pelicula varchar(50), dura_pelicula integer, " +
							"clas_pelicula integer, estado_pelicula integer)");
			statement
					.execute("insert into pelicula(cod_pelicula, nam_pelicula, gen_pelicula, dura_pelicula, clas_pelicula, estado_pelicula " +
							") values(2, 'Guerras de las Galaxias Episodio I', 'Ciencia Ficcion', 120, 1, 1)");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DbUtils.closeQuietly(connection);
		}
	}
}
