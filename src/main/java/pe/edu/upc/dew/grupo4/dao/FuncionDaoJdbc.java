package pe.edu.upc.dew.grupo4.dao;

import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;
import pe.edu.upc.dew.grupo4.model.Funcion;

public class FuncionDaoJdbc extends SimpleJdbcDaoSupport implements FuncionDao {

	@Override
	public Funcion getFuncionPorCodigo(int codigo) {
		return getSimpleJdbcTemplate().queryForObject(
				"select * from funcion where codfuncion=?",
				new BeanPropertyRowMapper<Funcion>(Funcion.class), codigo);
	}

	@Override
	public List<Funcion> getFunciones() {
		return getSimpleJdbcTemplate().query("select * from funcion",
				new BeanPropertyRowMapper<Funcion>(Funcion.class));	
	}

	@Override
	public void eliminar(int codigo) {
		getSimpleJdbcTemplate().update(
				"delete from funcion where codfuncion=?", codigo);

	}

	@Override
	public void updateFuncion(Funcion funcion) {
		getSimpleJdbcTemplate().update(
				"update funcion set codpelicula=?, hoinfuncion=?, hofifuncion=? where codfuncion=?",
				new Object[] { 
						funcion.getPeliFuncion().getCodPelicula(),
						funcion.getHofiFuncion(),
						funcion.getHofiFuncion(),
						funcion.getCodFuncion()});
	}

	@Override
	public void insertarFuncion(Funcion funcion) {
		getSimpleJdbcTemplate().update(
				"insert into funcion values (?,?,?,?)",
				new Object[] { funcion.getCodFuncion(),
						funcion.getPeliFuncion().getCodPelicula(),
						funcion.getHoinFuncion(),
						funcion.getHofiFuncion() 
					});
	}

}
