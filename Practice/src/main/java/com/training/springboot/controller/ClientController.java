/*package com.training.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.training.model.Client;
import com.training.springboot.service.ClientServiceImpl;

@RestController
public class ClientController {

	@Autowired
	private ClientServiceImpl clientService;

	@PostMapping(value = "/client", consumes = "application/json")
	public void addClient(@RequestBody Client client){
		clientService.addClient(client);
	}

	@GetMapping(value = "/clients", produces = "application/json")
	public List<Client> getAllClients(){
		return clientService.getAllClients();
	}
}
*/