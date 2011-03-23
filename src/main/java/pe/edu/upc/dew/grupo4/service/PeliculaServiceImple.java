package pe.edu.upc.dew.grupo4.service;

import java.util.List;

import pe.edu.upc.dew.grupo4.dao.PeliculaDao;
import pe.edu.upc.dew.grupo4.model.Pelicula;

public class PeliculaServiceImple implements PeliculaService {
	private PeliculaDao peliculaDao;
	
	public PeliculaDao getPeliculaDao() {
		return peliculaDao;
	}

	public void setPeliculaDao(PeliculaDao peliculaDao) {
		this.peliculaDao = peliculaDao;
	}

	public Pelicula getPeliculaPorCodigo(int codigo) {
		return peliculaDao.getPeliculaPorCodigo(codigo);
	}

	public List<Pelicula> getPeliculas() {
		return peliculaDao.getPeliculas();
	}

	public void actualizar(Pelicula pelicula) {
		peliculaDao.updatePelicula(pelicula.getCodPelicula(), pelicula.getNamPelicula());
	}

	public void insertar(Pelicula pelicula) {
		peliculaDao.insertarPelicula(pelicula);
	}

	public void eliminar(int codigo) {
		peliculaDao.eliminar(codigo);
	}

}
