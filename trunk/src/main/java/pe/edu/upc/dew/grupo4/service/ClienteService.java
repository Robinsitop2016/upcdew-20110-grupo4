package pe.edu.upc.dew.grupo4.service;

import java.util.List;

import pe.edu.upc.dew.grupo4.model.Cliente;

public interface ClienteService {
	Cliente getClientePorCodigo(int codigo);

	List<Cliente> getClientes();

	void actualizar(Cliente cliente);

	void insertar(Cliente cliente);

	void eliminar(int codigo);

}
