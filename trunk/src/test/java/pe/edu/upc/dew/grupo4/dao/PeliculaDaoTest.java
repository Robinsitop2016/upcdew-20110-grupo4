package pe.edu.upc.dew.grupo4.dao;

import org.junit.Assert;
import org.junit.Test;

import pe.edu.upc.dew.grupo4.model.JdbcUtils;
import pe.edu.upc.dew.grupo4.model.Pelicula;;

public class PeliculaDaoTest {

	@Test
	public void testGetpeliculaPorCodigo() {
		JdbcUtils.create();
		PeliculaDao peliculaDao = new PeliculaDaoImpl();
		Pelicula pelicula = peliculaDao.getPeliculaPorCodigo(2);
		Assert.assertEquals(2, pelicula.getCodPelicula());
	}
	


}
