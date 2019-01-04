package com.training.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ClientRowMapper implements RowMapper<Client2> {

	@Override
	public Client2 mapRow(ResultSet rs, int arg1) throws SQLException {

		Client2 client = new Client2();
		client.setClientId(rs.getInt("clientid"));
		client.setClientName(rs.getString("clientname"));
		client.setClientDept(rs.getString("clientdept"));

		return client;
	}
}
