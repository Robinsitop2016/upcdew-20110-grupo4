package pe.edu.upc.dew.grupo4.dao;

import java.util.List;

import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;

import pe.edu.upc.dew.grupo4.model.Boleto;

public class BoletoDaoJdbc extends SimpleJdbcDaoSupport implements BoletoDao {

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
	public void eliminar(int codigo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateBoleto(Boleto boleto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void insertarBoleto(Boleto boleto) {
		// TODO Auto-generated method stub

	}

}
