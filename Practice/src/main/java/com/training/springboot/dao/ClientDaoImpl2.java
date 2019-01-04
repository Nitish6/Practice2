package com.training.springboot.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.training.model.Client2;
import com.training.model.ClientRowMapper;
import com.training.springboot.iDao.ClientDao;

@Repository
public class ClientDaoImpl2 implements ClientDao {

	private final String INSERT_SQL = "INSERT INTO CLIENTSS(clientname, clientdept) values(?,?)";
	private final String GET_ALL_CLIENTS = "SELECT * FROM CLIENTSS";
	private final String GET_REQUIRED_CLIENT_SQL = "SELECT * FROM CLIENTSS WHERE clientid = ?";

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void addClient(Client2 client) {
		jdbcTemplate.update(INSERT_SQL, client.getClientName(), client.getClientDept());
	}

	@Override
	public List<Client2> getAllClients() {
		List<Client2> clientList = jdbcTemplate.query(GET_ALL_CLIENTS, new ClientRowMapper());
		return clientList;
	}

	@Override
	public Client2 getClient(Integer clientId) {
		Client2 requiredCLient = jdbcTemplate.queryForObject(GET_REQUIRED_CLIENT_SQL, new Object[]{clientId}, new ClientRowMapper());
		return requiredCLient;
	}

}
