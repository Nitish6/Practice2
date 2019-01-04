package com.training.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.model.Client2;
import com.training.springboot.dao.ClientDaoImpl2;
import com.training.springboot.iService.ClientService;

@Service
public class ClientServiceImpl2 implements ClientService {

	@Autowired
	private ClientDaoImpl2 clientDao;

	@Override
	public void addClient(Client2 client) {
		clientDao.addClient(client);	
	}

	@Override
	public List<Client2> getAllClients() {
		return clientDao.getAllClients();
	}

	@Override
	public Client2 getClient(Integer clientId) {
		return clientDao.getClient(clientId);
	}

}
