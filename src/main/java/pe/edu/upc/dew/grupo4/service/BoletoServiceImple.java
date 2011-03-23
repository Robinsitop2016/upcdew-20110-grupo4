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

	public Boleto getBoletoPorCodigo(int codigo) {
		return boletoDao.getBoletoPorCodigo(codigo);
	}

	public List<Boleto> getBoletos() {
		return boletoDao.getBoletos();
	}

	public void actualizar(Boleto boleto) {
		boletoDao.updateBoleto(boleto);
	}


	public void insertar(Boleto boleto) {
		boletoDao.insertarBoleto(boleto);

	}

	public void eliminar(int codigo) {
		boletoDao.eliminar(codigo);
	}

}
