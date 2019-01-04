package com.training.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModelProperty;

public class Client2 {

	@ApiModelProperty(notes = "The database generated feedback ID")
	private Integer clientId;

	//@NotNull

	@ApiModelProperty(notes = "client name")
	@Size(min = 1, max = 8, message = "name should be less than 2000")
	private String clientName;



	//	@Pattern(regexp = "^[1-5]$")
	@ApiModelProperty(notes = "client id")
	@NotNull
	@Size(min = 3, max = 8, message = "dept id should be less than 2000")
	private String clientDept;
	
	public Client2(){}
	
	public Client2(Integer clientId, String clientName, String clientDept) {
		super();
		this.clientId = clientId;
		this.clientName = clientName;
		this.clientDept = clientDept;
	}
	
	
	public Integer getClientId() {
		return clientId;
	}

	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getClientDept() {
		return clientDept;
	}

	public void setClientDept(String clientDept) {
		this.clientDept = clientDept;
	}
}

