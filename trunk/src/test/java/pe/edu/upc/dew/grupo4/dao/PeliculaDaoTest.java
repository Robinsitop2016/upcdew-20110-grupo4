package pe.edu.upc.dew.grupo4.dao;

import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pe.edu.upc.dew.grupo4.model.Pelicula;

public class PeliculaDaoTest {
	private PeliculaDao peliculaDao;
	private Pelicula pelicula;
	
	@Before
	public void before(){
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
		this.peliculaDao = context.getBean("peliculaDao", PeliculaDao.class);
		this.pelicula = context.getBean("pelicula", Pelicula.class);
	}
	
	@Test
	public void testGetPeliculaPorCodigo(){
		Pelicula pelicula = peliculaDao.getPeliculaPorCodigo(3247);
		Assert.assertEquals("Matrix - Revoluciones", pelicula.getNamPelicula());
	}
	
	@Test
	public void testGetPeliculas(){
		List<Pelicula> peliculas = peliculaDao.getPeliculas();
		Assert.assertEquals(3, peliculas.size());
	}
	
	@Test
	public void testInsertPelicula(){
		peliculaDao.insertarPelicula(pelicula);		
		List<Pelicula> peliculas = peliculaDao.getPeliculas();
		Assert.assertEquals(4, peliculas.size());
	}
	
	@Test
	public void testDeletePelicula(){
		peliculaDao.eliminar(2334);
		List<Pelicula> peliculas = peliculaDao.getPeliculas();
		Assert.assertEquals(3, peliculas.size());
	}
	
	@Test
	public void testUpdatePelicula(){
		peliculaDao.updatePelicula(3248, "Warcraft III");
		Pelicula pelicula = peliculaDao.getPeliculaPorCodigo(3248);
		Assert.assertEquals("Warcraft III", pelicula.getNamPelicula());
	}

}
