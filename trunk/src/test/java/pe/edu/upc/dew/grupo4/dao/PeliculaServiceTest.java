package pe.edu.upc.dew.grupo4.dao;

import junit.framework.Assert;
import java.util.List;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;

import pe.edu.upc.dew.grupo4.service.PeliculaService;
import pe.edu.upc.dew.grupo4.model.Pelicula;

public class PeliculaServiceTest {
	private PeliculaService peliculaService;
	private PeliculaDao peliculaDao;
	private Pelicula pelicula;
	
	@BeforeClass
	public static void beforeClass() {
		//JdbcUtils.create();
	}
	
	@Before
	public void before() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		this.peliculaDao = context.getBean("peliculaDao", PeliculaDao.class);
		this.pelicula = context.getBean("pelicula", Pelicula.class);
		this.peliculaService = context.getBean("peliculaService", PeliculaService.class);
		this.peliculaService.setPeliculaDao(this.peliculaDao);
		
	}
	@Test
	public void CrearPelicula(){ 
		/*Creo el objeto Pelicula*/
		
		this.pelicula.setCodPelicula(10);
		this.pelicula.setNamPelicula("pelicula uno");
		this.pelicula.setCarPelicula(1);
		this.pelicula.setClasPelicula(1);
		this.pelicula.setDuraPelicula(120);
		this.pelicula.setEstPelicula(1);
		this.pelicula.setGenPelicula("drama");
		
		//inserto la pelicula;
		this.peliculaService.insertar(this.pelicula);
		
		//Verifico si creo la pelicula
		
		Pelicula peliculaGrabada= this.peliculaService.getPeliculaPorCodigo(10);
		Assert.assertEquals(10, peliculaGrabada.getCodPelicula());
		
		//Assert.assertEquals(10, 10);
	}
	
	
	@Test
	public void ConsultarPelicula(){
		//Verifico si puedo consultar la pelicula
		this.pelicula = peliculaService.getPeliculaPorCodigo(10);
		Assert.assertEquals(10, this.pelicula.getCodPelicula());		
	}
	
	
	@Test
	public void EliminarPelicula(){

		this.peliculaService.eliminar(10);
		
		//Verifico si puedo consultar la pelicula
		try
			{
				this.pelicula = peliculaService.getPeliculaPorCodigo(10);
				Assert.fail();
			}
		catch(EmptyResultDataAccessException e )
			{
			//OK:
			}
	}
	
	
}	
