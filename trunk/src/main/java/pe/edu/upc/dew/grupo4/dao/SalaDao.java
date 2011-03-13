package pe.edu.upc.dew.grupo4.dao;

import java.util.List;

import pe.edu.upc.dew.grupo4.model.Sala;

public interface SalaDao {
	
	Sala getSalaPorCodigo(int codigo);
	
	List<Sala> getSalas();
	
	void eliminar(int salas);
	
	void updateSala(int codigo, String atriSala);
	
	void insertarSala(Sala sala);

}
