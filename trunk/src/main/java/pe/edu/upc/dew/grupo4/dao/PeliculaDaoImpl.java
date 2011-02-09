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
			System.out.println(pelicula.getCodPelicula()+", "+pelicula.getNamPelicula()+", "+pelicula.getGenPelicula()+
					", "+pelicula.getDuraPelicula()+", "+pelicula.getClasPelicula()+", "+pelicula.getEstadoPelicula());
			

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return pelicula;
	}
	
	@Override
	public void delPelicula(int codigo) {
		Connection connection = JdbcUtils.getConnection();
		try {
			Statement statement = connection.createStatement();
			String sql = "delete from pelicula where cod_pelicula = "+ codigo;
			statement.execute(sql);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void updatePelicula(Pelicula pelicula) {
		Connection connection = JdbcUtils.getConnection();
		try {
			Statement statement = connection.createStatement();
			String sql = "Update pelicula Set nam_Pelicula = '"+ pelicula.getNamPelicula() +"' where cod_pelicula = "+ pelicula.getCodPelicula();
			statement.execute(sql);
			Pelicula peliculaTmp = getPeliculaPorCodigo(pelicula.getCodPelicula());
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
