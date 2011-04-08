package pe.edu.upc.dew.grupo4.dao;

import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;
import pe.edu.upc.dew.grupo4.model.Cliente;

public class ClienteDaoJdbc extends SimpleJdbcDaoSupport implements ClienteDao {

	@Override
	public Cliente getClientePorCodigo(int codigo) {
		return getSimpleJdbcTemplate().queryForObject(
				"select * from cliente where codicliente=?",
				new BeanPropertyRowMapper<Cliente>(Cliente.class), codigo);
	}

	@Override
	public List<Cliente> getClientes() {
		return getSimpleJdbcTemplate().query("select * from cliente",
				new BeanPropertyRowMapper<Cliente>(Cliente.class));
	}

	@Override
	public void eliminar(int codigo) {
		getSimpleJdbcTemplate().update(
				"delete from cliente where codicliente=?", codigo);
	}

	@Override
	public void updateCliente(int codigo, String nombre) {
		getSimpleJdbcTemplate().update(
				"update cliente set namecliente=? where codicliente=?",
				new Object[] { nombre, codigo });
	}

	@Override
	public void insertarCliente(Cliente cliente) {
		getSimpleJdbcTemplate().update(
				"insert into cliente values (?,?,?,?,?,?,?,?,?)",
				new Object[] { cliente.getCodCliente(),
						cliente.getNamCliente(), cliente.getLastCliente(),
						cliente.getPassCliente(), cliente.getDniCliente(),
						cliente.getFenaCliente(), cliente.getDirCliente(),
						cliente.getTlfCliente(), cliente.getMailCliente() });
	}

}
