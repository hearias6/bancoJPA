package edu.cajero.app.dao;

//
//import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import edu.cajerojpa.app.dao.BancoDao;
import edu.cajerojpa.app.model.BancoEntity;



@ContextConfiguration(locations="classpath:application-context.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class BancoDaoTest {

	@Autowired
	private BancoDao bancoDao;
	
	private BancoEntity banco;
	
	@Before
	public void configuration() {
		banco = new BancoEntity();
		banco.setId(1);
		banco.setNit("01");
		banco.setNombre("banco 01");
		banco.setTelefono("001");
	}
	
	@Transactional
	@Rollback(true)
	@Test
	public void addNewBanco() {
		
//		BancoEntity banco = new BancoEntity(1,"1","1","1");
//		
//		bancoDao.addEmployee(banco);
		Boolean resultado = false;
		resultado = bancoDao.addBanco(banco);
		
		assertEquals(true, resultado);
		
	}

}
