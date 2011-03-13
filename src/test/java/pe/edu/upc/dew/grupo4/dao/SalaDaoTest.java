package pe.edu.upc.dew.grupo4.dao;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.edu.upc.dew.grupo4.model.Sala;

public class SalaDaoTest {
	private SalaDao salaDao;
	private Sala sala;
	
	@Before
	public void before(){
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
		this.salaDao = context.getBean("salaDao", SalaDao.class);
		this.sala = context.getBean("sala", Sala.class);
	}

	@Test
	public void testGetSalaPorCodigo(){
		Sala sala = salaDao.getSalaPorCodigo(134);
		Assert.assertEquals(34, sala.getCapaSala());
	}
	
	@Test
	public void testGetSalas(){
		List<Sala> salas = salaDao.getSalas();
		Assert.assertEquals(3, salas.size());
	}
	
	@Test
	public void testInsertSala(){
		salaDao.insertarSala(sala);
		List<Sala> salas = salaDao.getSalas();
		Assert.assertEquals(4, salas.size());
	}
	
	@Test
	public void testDeleteSala(){
		salaDao.eliminar(160);
		List<Sala> salas = salaDao.getSalas();
		Assert.assertEquals(3, salas.size());
	}
	
	@Test
	public void testUpdateSala(){
		salaDao.updateSala(135, "3D");
		Sala sala = salaDao.getSalaPorCodigo(135);
		Assert.assertEquals("3D", sala.getAtriSala());
	}
	
}