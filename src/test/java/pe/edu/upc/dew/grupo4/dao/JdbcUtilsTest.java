package pe.edu.upc.dew.grupo4.dao;

import java.sql.Connection;

import org.junit.Assert;
import org.junit.Test;

import pe.edu.upc.dew.grupo4.model.JdbcUtils;

public class JdbcUtilsTest {
	
	@Test
	public void testConnection(){
		Connection connection = JdbcUtils.getConnection();
		Assert.assertNotNull(connection);
	}
	
	@Test
	public void testCreate(){
		JdbcUtils.create();
	}
	
}
