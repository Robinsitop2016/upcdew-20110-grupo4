package pe.edu.upc.dew.grupo4.dao;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;

import pe.edu.upc.dew.grupo4.model.Sala;

public class SalaDaoJdbc extends SimpleJdbcDaoSupport implements SalaDao {

	@Override
	public Sala getSalaPorCodigo(int codigo) {
		return getSimpleJdbcTemplate().queryForObject(
				"select * from sala where codsala=?", 
				new BeanPropertyRowMapper<Sala>(Sala.class), codigo);
	}

	@Override
	public List<Sala> getSalas() {
		return getSimpleJdbcTemplate().query("select * from sala", 
				new BeanPropertyRowMapper<Sala>(Sala.class));
	}

	@Override
	public void eliminar(int codigo) {
		getSimpleJdbcTemplate().update("delete from sala where codsala?", 
				codigo);
	}

	@Override
	public void updateSala(int codigo, String atriSala) {
		getSimpleJdbcTemplate().update(
				"update sala set atrisala=? where codsala=?", 
				new Object[] { atriSala, codigo } );
	}

	@Override
	public void insertarSala(Sala sala) {
		getSimpleJdbcTemplate().update("insert into sala values (?,?,?,?,?)", 
				new Object[] { sala.getCodCine(),
				sala.getCodSala(), sala.getNroSala(),
				sala.getCapaSala(), sala.getAtriSala() });
	}

}
