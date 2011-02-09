package pe.edu.upc.dew.grupo4.dao;

import pe.edu.upc.dew.grupo4.model.Pelicula;

public interface PeliculaDao {
	
	Pelicula getPeliculaPorCodigo(int codigo);

	void delPelicula(int codigo);

	void updatePelicula(Pelicula pelicula);
	
	

}
