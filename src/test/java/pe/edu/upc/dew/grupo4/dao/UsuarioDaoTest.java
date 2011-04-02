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
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
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
		Assert.assertEquals(1, usuarios.size());
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
		this.usuario.setTelfUsuario(12);
		usuarioDao.insertarUsuario(this.usuario);
		List<Usuario> usuarios = usuarioDao.getUsuarios();
		Assert.assertEquals(3, usuarios.size());
	}
	
	@Test
	public void testDeleteUsuario(){
		usuarioDao.eliminar(1100);
		List<Usuario> usuarios = usuarioDao.getUsuarios();
		Assert.assertEquals(1, usuarios.size());
	}
	
	@Test
	public void testUpdateUsuario(){
		this.usuario.setCodUsuario(1002);
		this.usuario.setNamUsuario("Esau");
		this.usuario.setDniUsuario("10101010");
		usuarioDao.updateUsuario(this.usuario);
		Usuario usuario = usuarioDao.getUsuarioPorCodigo(1002);
		Assert.assertEquals("10101010", usuario.getDniUsuario());
	}
}
