package pe.edu.upc.dew.grupo4.service;

import java.util.List;

import pe.edu.upc.dew.grupo4.model.Boleto;
import pe.edu.upc.dew.grupo4.dao.BoletoDao;

public class BoletoServiceImple implements BoletoService {

	private BoletoDao boletoDao;
	public BoletoDao getBoletoDao() {
		return boletoDao;
	}

	public void setBoletoDao(BoletoDao boletoDao) {
		this.boletoDao = boletoDao;
	}

	@Override
	public Boleto getBoletoPorCodigo(int codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Boleto> getBoletos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizar(Boleto boleto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void insertar(Boleto boleto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminar(int codigo) {
		// TODO Auto-generated method stub

	}

}
