package pe.edu.upc.dew.grupo4.dao;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.EmptyResultDataAccessException;

import pe.edu.upc.dew.grupo4.model.Cliente;

public class ClienteDaoTest {
	private ClienteDao clienteDao;
	private Cliente cliente;
	
	@Before
	public void before(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		this.clienteDao = context.getBean("clienteDao", ClienteDao.class);
		this.cliente = context.getBean("cliente", Cliente.class);
	}

	@Test
	public void testInsertCliente(){
		this.cliente.setCodCliente(123);
		this.cliente.setDirCliente("Av. Lima");
		this.cliente.setDniCliente("10132576");
		this.cliente.setFenaCliente("2011-01-01");
		this.cliente.setLastCliente("Hernandez");
		this.cliente.setMailCliente("esau@gmail.com");
		this.cliente.setNamCliente("esau");
		this.cliente.setPassCliente("1234");
		this.cliente.setTlfCliente(123);
		clienteDao.insertarCliente(this.cliente);
		Cliente cliente = this.clienteDao.getClientePorCodigo(123);
		Assert.assertEquals(123, cliente.getCodCliente());
	}
	
	@Test
	public void testGetClientePorCodigo(){
		Cliente cliente = clienteDao.getClientePorCodigo(123);
		Assert.assertEquals(123, cliente.getCodCliente());
	}	
	
	@Test
	public void testDeleteCliente(){
		clienteDao.eliminar(123);
		try{
			Cliente cliente = this.clienteDao.getClientePorCodigo(123);
			Assert.fail();
		}
		catch(EmptyResultDataAccessException e )
		{
		//OK:
		}

	}
			
}
