package pe.edu.upc.dew.grupo4.service;

import java.util.List;

import pe.edu.upc.dew.grupo4.model.Cine;

public interface CineService {
	Cine getCinePorCodigo(int codigo);

	List<Cine> getCines();

	void actualizar(Cine cine);

	void insertar(Cine cine);

	void eliminar(int codigo);

}
