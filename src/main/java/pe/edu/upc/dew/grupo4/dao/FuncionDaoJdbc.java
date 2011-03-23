package pe.edu.upc.dew.grupo4.dao;

import java.util.List;

import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;

import pe.edu.upc.dew.grupo4.model.Funcion;

public class FuncionDaoJdbc extends SimpleJdbcDaoSupport implements FuncionDao {

	@Override
	public Funcion getFuncionPorCodigo(int codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Funcion> getFunciones() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar(int codigo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateFuncion(Funcion funcion) {
		// TODO Auto-generated method stub

	}

	@Override
	public void insertarFuncion(Funcion funcion) {
		// TODO Auto-generated method stub

	}

}
