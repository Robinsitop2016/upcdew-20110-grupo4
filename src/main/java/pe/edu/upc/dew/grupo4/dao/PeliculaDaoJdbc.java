package pe.edu.upc.dew.grupo4.dao;

import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;

import pe.edu.upc.dew.grupo4.model.Pelicula;

public class PeliculaDaoJdbc extends SimpleJdbcDaoSupport implements PeliculaDao {

	@Override
	public Pelicula getPeliculaPorCodigo(int codigo) {
		return getSimpleJdbcTemplate().queryForObject(
				"select * from pelicula where codpelicula=?",
				new BeanPropertyRowMapper<Pelicula>(Pelicula.class), codigo);
	}

	@Override
	public List<Pelicula> getPeliculas() {
		return getSimpleJdbcTemplate().query("select * from pelicula",
				new BeanPropertyRowMapper<Pelicula>(Pelicula.class));
	}

	@Override
	public void eliminar(int codigo) {
		getSimpleJdbcTemplate().update(
				"delete from pelicula where codpelicula=?", codigo);
	}

	@Override
	public void updatePelicula(int codigo, String nombre) {
		getSimpleJdbcTemplate().update(
				"update pelicula set nampelicula=? where codpelicula=?",
				new Object[] {codigo, nombre});
	}

	@Override
	public void insertarPelicula(Pelicula pelicula) {
		getSimpleJdbcTemplate().update(
				"Insert into pelicula values (?,?,?,?,?,?)",
				new Object[] 
				    { pelicula.getCodPelicula(),
						pelicula.getNamPelicula(), 
						pelicula.getGenPelicula(),
						pelicula.getDuraPelicula(), 
						pelicula.getClasPelicula(),
						pelicula.getEstPelicula(), 
					});
	}

}
