package pe.edu.upc.dew.grupo4.service;

import java.util.List;

import pe.edu.upc.dew.grupo4.dao.FuncionDao;
import pe.edu.upc.dew.grupo4.model.Funcion;

public class FuncionServiceImple implements FuncionService {
	private FuncionDao funcionDao;

	public Funcion getFuncionPorCodigo(int codigo) {
		return funcionDao.getFuncionPorCodigo(codigo);
	}

	public List<Funcion> getFunciones() {
		return funcionDao.getFunciones();
	}

	public void actualizar(Funcion funcion) {
		funcionDao.updateFuncion(funcion);
	}

	public void insertar(Funcion funcion) {
		funcionDao.insertarFuncion(funcion);
	}

	public void eliminar(int codigo) {
		funcionDao.eliminar(codigo);

	}

}
