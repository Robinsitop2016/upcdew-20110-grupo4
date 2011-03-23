package pe.edu.upc.dew.grupo4.service;

import java.util.List;

import pe.edu.upc.dew.grupo4.dao.UsuarioDao;
import pe.edu.upc.dew.grupo4.model.Usuario;

public class UsuarioServiceImple implements UsuarioService {
	public UsuarioDao usuarioDao;
	
	public UsuarioDao getUsuarioDao() {
		return usuarioDao;
	}

	public void setUsuarioDao(UsuarioDao usuarioDao) {
		this.usuarioDao = usuarioDao;
	}

	public Usuario getUsuarioPorCodigo(int codigo) {		
		return usuarioDao.getUsuarioPorCodigo(codigo);
	}

	public List<Usuario> getUsuarios() {
		return usuarioDao.getUsuarios();
	}

	public void actualizar(Usuario usuario) {
		usuarioDao.updateUsuario(usuario);
	}

	public void insertar(Usuario usuario) {
		usuarioDao.insertarUsuario(usuario);
	}

	public void eliminar(int codigo) {
		usuarioDao.eliminar(codigo);
	}

}
