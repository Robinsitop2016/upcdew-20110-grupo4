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
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		this.peliculaDao = context.getBean("peliculaDao", PeliculaDao.class);
		this.pelicula = context.getBean("pelicula", Pelicula.class);
	}
	
	@Test
	public void testInsertPelicula(){
		this.pelicula.setCodPelicula(145);
		this.pelicula.setCarPelicula(1);
		this.pelicula.setClasPelicula(1);
		this.pelicula.setDuraPelicula(120);
		this.pelicula.setGenPelicula("drama");
		this.pelicula.setNamPelicula("peli 1");
		this.peliculaDao.insertarPelicula(this.pelicula);		
		Pelicula peliculaprueba = peliculaDao.getPeliculaPorCodigo(145);
		Assert.assertEquals(145, peliculaprueba.getCodPelicula());
	}
	
	
	
	@Test
	public void testGetPeliculaPorCodigo(){
		Pelicula pelicula = peliculaDao.getPeliculaPorCodigo(145);
		Assert.assertEquals(145, pelicula.getCodPelicula());
	}
	
	
	@Test
	public void testDeletePelicula(){
		peliculaDao.eliminar(1);
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
