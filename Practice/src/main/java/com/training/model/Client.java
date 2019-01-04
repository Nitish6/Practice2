package com.training.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GenerationType;

@Entity
@Table(name="clients")
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer clientId;

	private String clientName;

	private Integer clientDept;

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

	public Integer getClientDept() {
		return clientDept;
	}

	public void setClientDept(Integer clientDept) {
		this.clientDept = clientDept;
	}
}

