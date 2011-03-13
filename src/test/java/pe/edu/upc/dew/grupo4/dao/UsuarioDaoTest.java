package pe.edu.upc.dew.grupo4.dao;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.edu.upc.dew.grupo4.model.Usuario;

public class UsuarioDaoTest {
	private UsuarioDao usuarioDao;
	private Usuario usuario;
	
	@Before
	public void before(){
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
		this.usuarioDao = context.getBean("usuarioDao", UsuarioDao.class);
		this.usuario = context.getBean("usuario", Usuario.class);
	}

	@Test
	public void testGetUsuarioPorCodigo(){
		Usuario usuario = usuarioDao.getUsuarioPorCodigo(1002);
		Assert.assertEquals("Aldo", usuario.getNamUsuario());
	}
	
	@Test
	public void testGetUsuarios(){
		List<Usuario> usuarios = usuarioDao.getUsuarios();
		Assert.assertEquals(3, usuarios.size());
	}
	
	@Test
	public void testInsertUsuario(){
		usuarioDao.insertarUsuario(usuario);
		List<Usuario> usuarios = usuarioDao.getUsuarios();
		Assert.assertEquals(4, usuarios.size());
	}
	
	@Test
	public void testDeleteUsuario(){
		usuarioDao.eliminar(1100);
		List<Usuario> usuarios = usuarioDao.getUsuarios();
		Assert.assertEquals(3, usuarios.size());
	}
	
	@Test
	public void testUpdateUsuario(){
		usuarioDao.updateUsuario(1002, "43837903");
		Usuario usuario = usuarioDao.getUsuarioPorCodigo(1002);
		Assert.assertEquals("43837903", usuario.getDniUsuario());
	}
}
