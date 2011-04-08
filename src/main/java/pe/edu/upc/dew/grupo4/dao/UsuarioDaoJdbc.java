package pe.edu.upc.dew.grupo4.dao;

import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;

import pe.edu.upc.dew.grupo4.model.Usuario;

public class UsuarioDaoJdbc extends SimpleJdbcDaoSupport implements UsuarioDao {

	@Override
	public Usuario getUsuarioPorCodigo(int codigo) {
		return getSimpleJdbcTemplate().queryForObject(
				"select * from usuario where codiusuario=?",
				new BeanPropertyRowMapper<Usuario>(Usuario.class), codigo);		
	}

	@Override
	public List<Usuario> getUsuarios() {
		return getSimpleJdbcTemplate().query("select * from usuario",
				new BeanPropertyRowMapper<Usuario>(Usuario.class));
	}

	@Override
	public void eliminar(int codigo) {
		getSimpleJdbcTemplate().update("delete from usuario where codiusuario=?",
				codigo);
	}

	@Override
	public void updateUsuario(Usuario usuario) {
		getSimpleJdbcTemplate().update(
				"update usuario set dniusuario=? where codiusuario=?",
				new Object[] { usuario.getDniUsuario(), usuario.getCodUsuario() });
	}

	@Override
	public void insertarUsuario(Usuario usuario) {
		getSimpleJdbcTemplate().update(
				"insert into usuario values (?,?,?,?,?,?,?,?,?,?)",
				new Object[] { 	
						usuario.getCodUsuario(),
						usuario.getNamUsuario(), 
						usuario.getLastUsuario(),
						usuario.getCargoUsuario(), 
						usuario.getPassUsuario(),
						usuario.getDniUsuario(), 
						usuario.getFenaUsuario(),
						usuario.getDirUsuario(), 
						usuario.getTelfUsuario(),
						usuario.getMailUsuario() 
					}
				);
	}

}
