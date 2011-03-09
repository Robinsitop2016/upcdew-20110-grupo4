package pe.edu.upc.dew.grupo4.dao;

import java.util.List;

import pe.edu.upc.dew.grupo4.model.Cliente;

public interface ClienteDao {
	
	Cliente getClientePorCodigo(int codigo);
	
	List<Cliente> getClientes();
	
	void eliminar(int codigo);
	
	void updateCliente(int codigo, String nombre);
	
	void insertarCliente(Cliente cliente);

}
