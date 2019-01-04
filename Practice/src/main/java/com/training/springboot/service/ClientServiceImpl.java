/*package com.training.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.model.Client;
import com.training.springboot.dao.ClientDaoImpl;
import com.training.springboot.iService.ClientService;

@Service
public class ClientServiceImpl implements ClientService {

	@Autowired
	private ClientDaoImpl clientDao;

	@Override
	public void addClient(Client client) {
		clientDao.addClient(client);	
	}

	@Override
	public List<Client> getAllClients() {
		return clientDao.getAllClients();
	}

}
*/