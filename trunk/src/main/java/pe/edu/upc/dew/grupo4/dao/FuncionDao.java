package pe.edu.upc.dew.grupo4.dao;

import java.util.List;

import pe.edu.upc.dew.grupo4.model.Funcion;

public interface FuncionDao {
	
	Funcion getFuncionPorCodigo(int codigo);
	
	List<Funcion> getFunciones();
	
	void eliminar(int codigo);
	
	void updateFuncion(Funcion funcion);
	
	void insertarFuncion(Funcion funcion);


}
