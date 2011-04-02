package pe.edu.upc.dew.grupo4.dao;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.edu.upc.dew.grupo4.model.Cliente;
import pe.edu.upc.dew.grupo4.model.Funcion;

public class FuncionDaoTest {
	private FuncionDao funcionDao;
	private Funcion funcion;

	@Before
	public void before() {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"Spring-Module.xml");
		this.funcionDao = context.getBean("funvionDao", FuncionDao.class);
		this.funcion = context.getBean("funcion", Funcion.class);
	}

	@Test
	public void testGetFuncionPorCodigo() {
		Funcion funcion = funcionDao.getFuncionPorCodigo(4321);
		Assert.assertEquals("Luis", funcion.getPeliFuncion());
	}

	@Test
	public void testGetFunciones() {
		List<Funcion> funciones = funcionDao.getFunciones();
		Assert.assertEquals(3, funciones.size());
	}

	@Test
	public void testInsertFuncion() {
		funcionDao.insertarFuncion(funcion);
		List<Funcion> funciones = funcionDao.getFunciones();
		Assert.assertEquals(4, funciones.size());
	}

	@Test
	public void testDeleteFuncion() {
		funcionDao.eliminar(4321);
		List<Funcion> funciones = funcionDao.getFunciones();
		Assert.assertEquals(3, funciones.size());
	}

	@Test
	public void testUpdateFuncion() {
		funcionDao.updateFuncion(funcion);
		Funcion Funcion = funcionDao.getFuncionPorCodigo(2123);
		Assert.assertEquals("Eduardo", funcion.getPeliFuncion());
	}
}
