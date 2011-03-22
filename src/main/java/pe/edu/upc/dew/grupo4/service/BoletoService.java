package pe.edu.upc.dew.grupo4.service;

import java.util.List;

import pe.edu.upc.dew.grupo4.model.Boleto;

public interface BoletoService {
	Boleto getBoletoPorCodigo(int codigo);

	List<Boleto> getBoletos();

	void actualizar(Boleto boleto);

	void insertar(Boleto boleto);

	void eliminar(int codigo);

}
