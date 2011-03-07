package pe.edu.upc.dew.grupo4.dao;

import java.util.List;

import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;

import pe.edu.upc.dew.grupo4.model.Pelicula;

public class PeliculaDaoJdbc extends SimpleJdbcDaoSupport implements
		PeliculaDao {

	@Override
	public Pelicula getPeliculaPorCodigo(int codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Pelicula> getPeliculas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Pelicula> getPeliculasCarteleraEstreno() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar(int codigo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updatePelicula(int codigo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertarPelicula(Pelicula pelicula) {
		// TODO Auto-generated method stub
		
	}

}
