package pe.edu.upc.dew.grupo4.service;

import java.util.List;

import pe.edu.upc.dew.grupo4.model.Cliente;
import pe.edu.upc.dew.grupo4.dao.ClienteDao;

public class ClienteServiceImple implements ClienteService {
	private ClienteDao clienteDao;
	
	public ClienteDao getClienteDao() {
		return clienteDao;
	}

	public void setClienteDao(ClienteDao clienteDao) {
		this.clienteDao = clienteDao;
	}

	public Cliente getClientePorCodigo(int codigo) {		
		return clienteDao.getClientePorCodigo(codigo);
	}

	public List<Cliente> getClientes() {
		return clienteDao.getClientes();
	}

	public void actualizar(Cliente cliente) {
		clienteDao.updateCliente(cliente.getCodCliente(), cliente.getNamCliente());
	}

	public void insertar(Cliente cliente) {
		clienteDao.insertarCliente(cliente);

	}

	public void eliminar(int codigo) {
		clienteDao.eliminar(codigo);

	}

}
