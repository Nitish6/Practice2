package com.training.springboot.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.google.common.io.Resources;
import com.training.model.Client2;
import com.training.springboot.service.ClientServiceImpl2;
//import com.training.validator.ClientValidator;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@Api(value="/client",description="client Profile",produces ="application/json")

public class ClientController2 {

	@Autowired
	private ClientServiceImpl2 clientService;

	/*@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.addValidators(new ClientValidator());
	}*/

	@PostMapping(value = "/client/clientTemplate", consumes = "application/json")
	public void addClient(@Valid @RequestBody Client2 client){
		clientService.addClient(client);
	}

	@ApiOperation(value="get Client",response= Client2.class)
	@ApiResponses(value={
			@ApiResponse(code=200,message="Customer Details Retrieved",response= Client2.class),
			@ApiResponse(code=500,message="Internal Server Error"),
			@ApiResponse(code=404,message="Client2 not found")
	})

	@GetMapping(value = "/client/clientsTemplate", produces = "application/json")
	public List<Client2> getAllClients(){
		return clientService.getAllClients();
	}

	@ApiOperation(value="get Client by id",response= Client2.class)
	@ApiResponses(value={
			@ApiResponse(code=200,message="Customer Details Retrieved",response= Client2.class),
			@ApiResponse(code=500,message="Internal Server Error"),
			@ApiResponse(code=404,message="Client2 not found")
	})
	@GetMapping(value = "/client/{clien}", produces = "application/json")
	public ResponseEntity<?> getClient(@PathVariable("clien") Integer clientIds){
		System.out.println(clientIds);

		Client2 cl = clientService.getClient(clientIds);
		/*
		if(clientService.getClient(clientId) != null){
			return ResponseEntity.status(HttpStatus.OK);
		}*/

		return ResponseEntity.ok(cl);
	}
	
	

	
	
	
	
	
	
}

