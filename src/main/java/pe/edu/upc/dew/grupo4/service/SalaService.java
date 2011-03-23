package pe.edu.upc.dew.grupo4.service;

import java.util.List;

import pe.edu.upc.dew.grupo4.model.Sala;

public interface SalaService {
	Sala getSalaPorCodigo(int codigo);

	List<Sala> getSalas(int codcine);

	void actualizar(Sala sala, String Atributo);

	void insertar(Sala sala);

	void eliminar(Sala sala);


}
