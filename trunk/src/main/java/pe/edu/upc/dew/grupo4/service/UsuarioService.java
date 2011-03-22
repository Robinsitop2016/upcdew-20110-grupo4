package pe.edu.upc.dew.grupo4.service;

import java.util.List;

import pe.edu.upc.dew.grupo4.model.Usuario;

public interface UsuarioService {
	Usuario getUsuarioPorCodigo(int codigo);

	List<Usuario> getUsuarios();

	void actualizar(Usuario pelicula);

	void insertar(Usuario pelicula);

	void eliminar(int codigo);
	

}
