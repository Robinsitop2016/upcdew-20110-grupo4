package pe.edu.upc.dew.grupo4.service;

import java.util.List;

import pe.edu.upc.dew.grupo4.model.Funcion;

public interface FuncionService {
	Funcion getFuncionPorCodigo(int codigo);

	List<Funcion> getFunciones();

	void actualizar(Funcion funcion);

	void insertar(Funcion funcion);

	void eliminar(int codigo);

}
