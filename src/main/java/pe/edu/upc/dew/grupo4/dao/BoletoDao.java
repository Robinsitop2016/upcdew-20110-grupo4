package pe.edu.upc.dew.grupo4.dao;

import java.util.List;

import pe.edu.upc.dew.grupo4.model.Boleto;

public interface BoletoDao {
	Boleto getBoletoPorCodigo(int codigo);
	
	List<Boleto> getBoletos();
	
	void eliminar(int codigo);
	
	void updateBoleto(Boleto boleto);
	
	void insertarBoleto(Boleto boleto);


}
