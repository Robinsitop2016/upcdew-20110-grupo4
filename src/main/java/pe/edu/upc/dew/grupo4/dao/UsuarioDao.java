package pe.edu.upc.dew.grupo4.dao;

import java.util.List;

import pe.edu.upc.dew.grupo4.model.Usuario;

public interface UsuarioDao {

	Usuario getUsuarioPorCodigo(int codigo);
	
	List<Usuario> getUsuarios();
	
	void eliminar(int codigo);
	
	void updateUsuario(int codigo, String i);
	
	void insertarUsuario(Usuario usuario);
	
}
