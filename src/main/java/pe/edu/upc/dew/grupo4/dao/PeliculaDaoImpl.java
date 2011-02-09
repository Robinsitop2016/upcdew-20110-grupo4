package pe.edu.upc.dew.grupo4.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import pe.edu.upc.dew.grupo4.model.JdbcUtils;
import pe.edu.upc.dew.grupo4.model.Pelicula;

public class PeliculaDaoImpl implements PeliculaDao {

	@Override
	public Pelicula getPeliculaPorCodigo(int codigo) {
		Connection connection = JdbcUtils.getConnection();
		Pelicula pelicula = null;
		try {
			Statement statement = connection.createStatement();
			String sql = "select * from pelicula where cod_pelicula = "+ codigo;
			ResultSet resultSet = statement.executeQuery(sql);
			if (resultSet.next()) {
				pelicula = new Pelicula();
				pelicula.setCodPelicula(resultSet.getInt("cod_pelicula"));
				pelicula.setNamPelicula(resultSet.getString("nam_pelicula"));
				pelicula.setGenPelicula(resultSet.getString("gen_pelicula"));
				pelicula.setDuraPelicula(resultSet.getInt("dura_pelicula"));
				pelicula.setClasPelicula(resultSet.getInt("clas_pelicula"));
				pelicula.setEstadoPelicula(resultSet.getInt("estado_pelicula"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return pelicula;
	}

}
