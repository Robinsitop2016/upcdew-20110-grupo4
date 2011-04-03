package pe.edu.upc.dew.grupo4.service;

import java.util.List;

import pe.edu.upc.dew.grupo4.dao.PeliculaDao;
import pe.edu.upc.dew.grupo4.model.Pelicula;;

public interface PeliculaService {

	public PeliculaDao getPeliculaDao();
	public void setPeliculaDao(PeliculaDao peliculaDao);
	
	Pelicula getPeliculaPorCodigo(int codigo);

	List<Pelicula> getPeliculas();

	void actualizar(Pelicula pelicula);

	void insertar(Pelicula pelicula);

	void eliminar(int codigo);

}
