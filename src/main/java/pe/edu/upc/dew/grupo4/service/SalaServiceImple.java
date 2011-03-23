package pe.edu.upc.dew.grupo4.service;

import java.util.List;

import pe.edu.upc.dew.grupo4.dao.SalaDao;
import pe.edu.upc.dew.grupo4.model.Sala;

public class SalaServiceImple implements SalaService {
	private SalaDao salaDao;

	public Sala getSalaPorCodigo(int codigo) {
		return salaDao.getSalaPorCodigo(codigo);
	}

	public List<Sala> getSalas(int codcine) {
		return salaDao.getSalas();
	}

	public void actualizar(Sala sala, String Atributo) {
		salaDao.updateSala(sala.getCodSala(), Atributo);

	}
	
	public void insertar(Sala sala) {
		salaDao.insertarSala(sala);

	}

	public void eliminar(Sala sala) {
		salaDao.eliminar(sala.getCodSala());

	}

}
