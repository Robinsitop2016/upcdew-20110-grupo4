package pe.edu.upc.dew.grupo4.dao;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.EmptyResultDataAccessException;

import pe.edu.upc.dew.grupo4.service.PeliculaService;
import pe.edu.upc.dew.grupo4.model.Pelicula;

public class PeliculaServiceTest {
	private PeliculaService peliculaService;
	
	@BeforeClass
	public static void beforeClass() {
		//JdbcUtils.create();
	}
	
	@Before
	public void before() {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"/applicationContext.xml");
		this.peliculaService = context.getBean("PeliculaService",PeliculaService.class);
	}
	@Test
	public void CrearPelicula(){
		/*Creo el objeto Pelicula*/
		Pelicula pelicula=new Pelicula();
		pelicula.setCodPelicula(10);
		pelicula.setNamPelicula("pelicula uno");
		pelicula.setCarPelicula(1);
		pelicula.setClasPelicula(1);
		pelicula.setDuraPelicula(120);
		pelicula.setEstPelicula(1);
		pelicula.setGenPelicula("drama");
		
		peliculaService.insertar(pelicula);
		
		//Verifico si creo la pelicula
		Pelicula peliculaGrabada=peliculaService.getPeliculaPorCodigo(10);
		Assert.assertEquals(10, peliculaGrabada.getCodPelicula());
		
	}
}	
/*	
	@Test
	public void ConsultarPelicula(){
		
		
		//Verifico si puedo consultar la pelicula
		Pelicula peliculaGrabada=peliculaService.getPelicula(1);
		Assert.assertEquals(1, peliculaGrabada.getCoPelicula());
		
	}
	
	@Test
	public void EliminarPelicula(){

		Pelicula pelicula=new Pelicula();
		pelicula.setCoPelicula(12);
		pelicula.setNombre("Spiderman 2");

		peliculaService.crear(pelicula);
		
		//Elimino
		peliculaService.eliminar(12);
		
		//Verifico que se elimino
		try
		{
			Pelicula peliculaConsultada= peliculaService.getPelicula(12);
			Assert.fail();
		}catch(EmptyResultDataAccessException e )
		{
			//OK:
		}
		
	}
	
	@Test
	public void ActualizarPelicula(){
	
		Pelicula pelicula=peliculaService.getPelicula(1);
		
		//Actualizo el Nombre
		
		pelicula.setNombre("Spiderman 3");
		
		peliculaService.actualizar(pelicula);
		
		//Obtengo pelicula y comparo el nombre
		Pelicula peliculaConsultada=peliculaService.getPelicula(1);
		Assert.assertEquals("Spiderman 3", peliculaConsultada.getNombre());
		
		
	}

	
}

*/

