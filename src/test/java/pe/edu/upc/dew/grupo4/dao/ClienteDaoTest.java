package pe.edu.upc.dew.grupo4.dao;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.edu.upc.dew.grupo4.model.Cliente;

public class ClienteDaoTest {
	private ClienteDao clienteDao;
	private Cliente cliente;
	
	@Before
	public void before(){
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
		this.clienteDao = context.getBean("clienteDao", ClienteDao.class);
		this.cliente = context.getBean("cliente", Cliente.class);
	}
	
	@Test
	public void testGetClientePorCodigo(){
		Cliente cliente = clienteDao.getClientePorCodigo(2124);
		Assert.assertEquals("Luis", cliente.getNamCliente());
	}
	
	@Test
	public void testGetClientes(){
		List<Cliente> clientes = clienteDao.getClientes();
		Assert.assertEquals(3, clientes.size());
	}
	
	@Test
	public void testInsertCliente(){
		clienteDao.insertarCliente(cliente);
		List<Cliente> clientes = clienteDao.getClientes();
		Assert.assertEquals(4, clientes.size());
	}
	
	@Test
	public void testDeleteCliente(){
		clienteDao.eliminar(2789);
		List<Cliente> clientes = clienteDao.getClientes();
		Assert.assertEquals(3, clientes.size());
	}
	
	@Test
	public void testUpdateCliente(){
		clienteDao.updateCliente(2123, "Eduardo");
		Cliente cliente = clienteDao.getClientePorCodigo(2123);
		Assert.assertEquals("Eduardo", cliente.getNamCliente());
	}

}
