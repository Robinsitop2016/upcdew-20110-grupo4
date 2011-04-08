package pe.edu.upc.dew.grupo4.dao;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.EmptyResultDataAccessException;

import pe.edu.upc.dew.grupo4.model.Usuario;

public class UsuarioDaoTest {
	private UsuarioDao usuarioDao;
	private Usuario usuario;
	
	@Before
	public void before(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		this.usuarioDao = context.getBean("usuarioDao", UsuarioDao.class);
		this.usuario = context.getBean("usuario", Usuario.class);
	}

	@Test
	public void testInsertUsuario(){
		this.usuario.setCargoUsuario("Administrador");
		this.usuario.setCodUsuario(234);
		this.usuario.setDirUsuario("Su casa");
		this.usuario.setDniUsuario("11111111");
		this.usuario.setLastUsuario("Hernandez");
		this.usuario.setMailUsuario("esau.hernandez@gmail.com");
		this.usuario.setPassUsuario("1111");
		this.usuario.setNamUsuario("Carlos");
		this.usuario.setTelfUsuario(12);
		this.usuarioDao.insertarUsuario(this.usuario);
		
		Usuario usuarioPrueba = this.usuarioDao.getUsuarioPorCodigo(234);
		Assert.assertEquals(234, usuarioPrueba.getCodUsuario());
		
	}
	/*
	@Test
	public void testGetUsuarioPorCodigo(){
		Usuario usuario = this.usuarioDao.getUsuarioPorCodigo(234);
		Assert.assertEquals(234, usuario.getCodUsuario());
	}
	*/
	
	@Test
	public void testDeleteUsuario(){
		this.usuarioDao.eliminar(234);
		try
		{
			this.usuario = this.usuarioDao.getUsuarioPorCodigo(234);
			Assert.fail();
		}
		catch(EmptyResultDataAccessException e )
		{
		//OK:
		}		
	}
	
}
