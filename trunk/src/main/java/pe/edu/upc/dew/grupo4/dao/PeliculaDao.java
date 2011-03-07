package pe.edu.upc.dew.grupo4.dao;

import java.util.List;

import pe.edu.upc.dew.grupo4.model.Pelicula;

public interface PeliculaDao {
	
	Pelicula getPeliculaPorCodigo(int codigo);
	
	List<Pelicula> getPeliculas();
	
	void eliminar(int codigo);
	
	void updatePelicula(int codigo, String nombre);
	
	void insertarPelicula(Pelicula pelicula);

}
