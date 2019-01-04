package com.training.springboot.iDao;

import java.util.List;

import com.training.model.Client;
import com.training.model.Client2;

public interface ClientDao {

	public void addClient(Client2 client);
	public List<Client2> getAllClients();
	public Client2 getClient(Integer clientId);
}
